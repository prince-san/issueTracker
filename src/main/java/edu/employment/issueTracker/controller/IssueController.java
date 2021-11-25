package edu.employment.issueTracker.controller;

import edu.employment.issueTracker.DTO.CreateCommentDTO;
import edu.employment.issueTracker.DTO.CreateIssueDTO;
import edu.employment.issueTracker.DTO.ViewIssueDTO;
import edu.employment.issueTracker.service.IssueService;
import edu.employment.issueTracker.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/issue")
public class IssueController {

    @Autowired
    IssueService issueService;

    @Autowired
    StatusService statusService;

    @GetMapping("/get")
    public String getIssue(@RequestParam(name = "id") String id, Model model) {
        model.addAttribute("issue", issueService.getIssue(Long.parseLong(id)));
        model.addAttribute("statuses", statusService.getAllStatuses());
        model.addAttribute("createCommentDTO", new CreateCommentDTO());
        return "issue";
    }

    @GetMapping("/create")
    public String createIssueForm(Model model) {
        model.addAttribute("createIssueDTO", new CreateIssueDTO());
        return "create";
    }

    @PostMapping("/create")
    public String createIssueSubmit(@ModelAttribute CreateIssueDTO createIssueDTO, Model model) {
        issueService.createIssue(createIssueDTO);
        return "created";
    }
}
