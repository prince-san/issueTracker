package edu.employment.issueTracker.DTO;

import lombok.Data;

@Data
public class CreateCommentDTO {

    private String author;
    private String text;
    private Long status_id;
}

