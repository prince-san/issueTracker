package edu.employment.issueTracker.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {

    private Long id;
    private String author;
    private String text;
    private Date date;
    private Status status;
    private Issue issue;
}
