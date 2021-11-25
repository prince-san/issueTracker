package edu.employment.issueTracker.controller;

import edu.employment.issueTracker.DTO.CreateCommentDTO;
import edu.employment.issueTracker.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/create")
    public String createComment(@RequestParam(name = "id") String issueId, @ModelAttribute CreateCommentDTO createCommentDTO,
                                Model model) {
        commentService.addCommentToIssue(createCommentDTO, Long.parseLong(issueId));
        return "created";
    }
}
