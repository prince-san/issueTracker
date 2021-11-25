package edu.employment.issueTracker.service;

import edu.employment.issueTracker.DTO.CreateIssueDTO;
import edu.employment.issueTracker.DTO.ViewIssueDTO;
import edu.employment.issueTracker.DTOMapper.DTOMapper;
import edu.employment.issueTracker.model.entity.Issue;
import edu.employment.issueTracker.model.mapper.CommentMapper;
import edu.employment.issueTracker.model.mapper.IssueMapper;
import edu.employment.issueTracker.DTO.IndexIssueDTO;
import edu.employment.issueTracker.model.mapper.StatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    IssueMapper issueMapper;

    @Autowired
    CommentMapper commentMapper;

    @Autowired
    StatusMapper statusMapper;

    @Autowired
    DTOMapper dtoMapper;

    @Override
    public int createIssue(CreateIssueDTO createIssueDTO) {
        Issue issue = dtoMapper.createIssueDTOToIssue(createIssueDTO);
        issue.setDate(new Date());
        issue.setStatus(statusMapper.getByName("Created"));
        return issueMapper.create(issue);
    }

    @Override
    public ViewIssueDTO getIssue(Long id) {
        return dtoMapper.issueToViewIssueDTO(issueMapper.get(id));
    }

    @Override
    public List<IndexIssueDTO> getAllIssues() {
        return issueMapper
                .getAll()
                .stream()
                .map(issue -> dtoMapper.issueToIndexIssueDTO(issue))
                .collect(Collectors.toList());
    }
}
