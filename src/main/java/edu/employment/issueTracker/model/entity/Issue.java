package edu.employment.issueTracker.model.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Issue {

    private Long id;
    private String name;
    private String author;
    private String description;
    private Date date;
    private Status status;
    private List<Comment> comments;
}
