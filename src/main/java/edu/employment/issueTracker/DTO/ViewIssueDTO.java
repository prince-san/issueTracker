package edu.employment.issueTracker.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ViewIssueDTO extends IndexIssueDTO{

    private String author;
    private String description;
    private List<ViewCommentDTO> comments;
}
