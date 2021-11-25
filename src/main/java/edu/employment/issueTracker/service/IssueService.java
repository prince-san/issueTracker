package edu.employment.issueTracker.service;

import edu.employment.issueTracker.DTO.CreateIssueDTO;
import edu.employment.issueTracker.DTO.IndexIssueDTO;
import edu.employment.issueTracker.DTO.ViewIssueDTO;

import java.util.List;

public interface IssueService {

    int createIssue(CreateIssueDTO createIssueDTO);

    ViewIssueDTO getIssue(Long id);

    List<IndexIssueDTO> getAllIssues();
}
