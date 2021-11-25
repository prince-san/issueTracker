package edu.employment.issueTracker.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class IndexIssueDTO {

    private Long id;
    private String name;
    private String status;
    private Date date;
}