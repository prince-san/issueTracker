package edu.employment.issueTracker.controller;

import edu.employment.issueTracker.mapper.IssueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/issue")
public class IssueController {

    @Autowired
    IssueMapper issueMapper;

    @GetMapping("/get")
    public String issue(@RequestParam(name = "id", required = false, defaultValue = "1") String id, Model model){


        model.addAttribute("name", issueMapper.get(Integer.parseInt(id)).getName());
        model.addAttribute("description", issueMapper.get(Integer.parseInt(id)).getDescription());

        return "issue";
    }
}
