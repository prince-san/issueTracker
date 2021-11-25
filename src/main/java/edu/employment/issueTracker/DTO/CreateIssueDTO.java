package edu.employment.issueTracker.DTO;

import lombok.Data;

@Data
public class CreateIssueDTO{

    private String name;
    private String author;
    private String description;
}