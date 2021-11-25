package edu.employment.issueTracker.controller;

import edu.employment.issueTracker.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    IssueService issueService;

    @GetMapping
    public String allIssues(Model model) {
        model.addAttribute("issues", issueService.getAllIssues());
        return "index";
    }
}
