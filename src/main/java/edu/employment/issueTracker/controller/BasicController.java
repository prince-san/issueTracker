package edu.employment.issueTracker.controller;

import edu.employment.issueTracker.mapper.IssueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @Autowired
    IssueMapper issueMapper;

    @GetMapping
    public String allIssues(Model model) {

        model.addAttribute("issues", issueMapper.getAll());
        return "index";
    }
}
