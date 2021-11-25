package edu.employment.issueTracker.DTOMapper;

import edu.employment.issueTracker.DTO.*;
import edu.employment.issueTracker.model.entity.Comment;
import edu.employment.issueTracker.model.entity.Issue;
import edu.employment.issueTracker.model.entity.Status;

public interface DTOMapper {

    public IndexIssueDTO issueToIndexIssueDTO(Issue issue);

    public ViewIssueDTO issueToViewIssueDTO(Issue issue);

    public Issue createIssueDTOToIssue(CreateIssueDTO createIssueDTO);

    public StatusDTO statusToStatusDTO(Status status);

    public Status statusDTOToStatus(StatusDTO statusDTO);

    public Comment createCommentDTOToComment(CreateCommentDTO createCommentDTO);

    public ViewCommentDTO commentToViewCommentDTO(Comment comment);
}
