package edu.employment.issueTracker.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class ViewCommentDTO {

    private String author;
    private String text;
    private Date date;
    private StatusDTO statusDTO;
}
