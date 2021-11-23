package edu.employment.issueTracker.service;

import edu.employment.issueTracker.mapper.IssueMapper;
import edu.employment.issueTracker.model.entity.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    IssueMapper issueMapper;

    @Override
    public int createIssue(Issue issue) {
        return issueMapper.create(issue);
    }

    @Override
    public Issue getIssue(Long id) {
        return issueMapper.get(id);
    }

    @Override
    public List<Issue> getAllIssues() {
        return issueMapper.getAll();
        
    }
}
