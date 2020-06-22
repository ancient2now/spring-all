package com.akikun.springboot.web;

import com.akikun.springboot.config.ConfigCenter;
import com.akikun.springboot.config.ProjectConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private ConfigCenter configCenter;

    @Autowired
    private ProjectConfig projectConfig;

    @RequestMapping("/project")
    public ProjectConfig project() {
        ProjectConfig projectConf = configCenter.getProject();
        System.err.println(projectConf.toString());
        return projectConf;
    }

    @RequestMapping("/project2")
    public ProjectConfig project2() {

        System.err.println(projectConfig.toString());
        return projectConfig;
    }

}
