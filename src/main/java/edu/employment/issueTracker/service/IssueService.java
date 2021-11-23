package edu.employment.issueTracker.service;

import edu.employment.issueTracker.model.entity.Issue;

import java.util.List;

public interface IssueService {

    int createIssue(Issue issue);

    Issue getIssue(Long id);

    List<Issue> getAllIssues();
}
