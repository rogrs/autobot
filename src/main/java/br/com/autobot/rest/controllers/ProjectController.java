package br.com.autobot.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {

    @RequestMapping("/project")
    public String home() {
        return "project";
    }

}
