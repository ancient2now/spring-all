package com.akikun.springboot.web;

import com.akikun.springboot.config.ConfigCenter;
import com.akikun.springboot.config.ProjectProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @RequestMapping("/project")
    public ProjectProperty project() {
        ProjectProperty projectConf = ConfigCenter.getProject();
        System.err.println(projectConf.toString());
        return projectConf;
    }

}
