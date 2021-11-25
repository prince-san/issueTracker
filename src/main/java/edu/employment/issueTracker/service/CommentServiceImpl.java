package edu.employment.issueTracker.service;

import edu.employment.issueTracker.DTO.CreateCommentDTO;
import edu.employment.issueTracker.DTOMapper.DTOMapper;
import edu.employment.issueTracker.model.entity.Comment;
import edu.employment.issueTracker.model.entity.Issue;
import edu.employment.issueTracker.model.entity.Status;
import edu.employment.issueTracker.model.mapper.CommentMapper;
import edu.employment.issueTracker.model.mapper.IssueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentMapper commentMapper;

    @Autowired
    IssueMapper issueMapper;

    @Autowired
    DTOMapper dtoMapper;

    @Override
    public void addCommentToIssue(CreateCommentDTO createCommentDTO, Long issueId) {
        Comment comment = dtoMapper.createCommentDTOToComment(createCommentDTO);
        comment.setDate(new Date());
        Issue issue = new Issue();
        issue.setId(issueId);
        Status status = new Status();
        status.setId(createCommentDTO.getStatus_id());
        issue.setStatus(status);
        comment.setIssue(issue);
        commentMapper.create(comment);
        issueMapper.updateStatus(issue);
    }
}
