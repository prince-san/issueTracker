package edu.employment.issueTracker.DTOMapper;

import edu.employment.issueTracker.DTO.*;
import edu.employment.issueTracker.model.entity.Comment;
import edu.employment.issueTracker.model.entity.Issue;
import edu.employment.issueTracker.model.entity.Status;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class DTOMapperImpl implements DTOMapper {

    @Override
    public IndexIssueDTO issueToIndexIssueDTO(Issue issue) {
        IndexIssueDTO indexIssueDTO = new IndexIssueDTO();
        indexIssueDTO.setId(issue.getId());
        indexIssueDTO.setDate(issue.getDate());
        indexIssueDTO.setName(issue.getName());
        indexIssueDTO.setStatus(issue.getStatus().getName());
        return indexIssueDTO;
    }

    @Override
    public ViewIssueDTO issueToViewIssueDTO(Issue issue) {
        ViewIssueDTO viewIssueDTO = new ViewIssueDTO();
        viewIssueDTO.setId(issue.getId());
        viewIssueDTO.setDate(issue.getDate());
        viewIssueDTO.setName(issue.getName());
        viewIssueDTO.setStatus(issue.getStatus().getName());
        viewIssueDTO.setAuthor(issue.getAuthor());
        viewIssueDTO.setDescription(issue.getDescription());
        viewIssueDTO.setComments(issue.getComments().stream().map(this::commentToViewCommentDTO).collect(Collectors.toList()));
        return viewIssueDTO;
    }

    @Override
    public Issue createIssueDTOToIssue(CreateIssueDTO createIssueDTO) {
        Issue issue = new Issue();
        issue.setName(createIssueDTO.getName());
        issue.setAuthor(createIssueDTO.getAuthor());
        issue.setDescription(createIssueDTO.getDescription());
        return issue;
    }

    @Override
    public StatusDTO statusToStatusDTO(Status status) {
        StatusDTO statusDTO = new StatusDTO();
        statusDTO.setId(status.getId());
        statusDTO.setName(status.getName());
        return statusDTO;
    }

    @Override
    public Status statusDTOToStatus(StatusDTO statusDTO) {
        Status status = new Status();
        status.setId(statusDTO.getId());
        status.setName(statusDTO.getName());
        return status;
    }

    @Override
    public Comment createCommentDTOToComment(CreateCommentDTO createCommentDTO) {
        Comment comment = new Comment();
        Status status = new Status();
        comment.setAuthor(createCommentDTO.getAuthor());
        comment.setText(createCommentDTO.getText());
        status.setId(createCommentDTO.getStatus_id());
        comment.setStatus(status);
        return comment;
    }

    @Override
    public ViewCommentDTO commentToViewCommentDTO(Comment comment) {
        ViewCommentDTO viewCommentDTO = new ViewCommentDTO();
        viewCommentDTO.setAuthor(comment.getAuthor());
        viewCommentDTO.setDate(comment.getDate());
        viewCommentDTO.setText(comment.getText());
        viewCommentDTO.setStatusDTO(statusToStatusDTO(comment.getStatus()));
        return viewCommentDTO;
    }
}
