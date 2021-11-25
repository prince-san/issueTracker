package edu.employment.issueTracker.service;

import edu.employment.issueTracker.DTO.CreateCommentDTO;

public interface CommentService {

    void addCommentToIssue(CreateCommentDTO createCommentDTO, Long issueId);
}
