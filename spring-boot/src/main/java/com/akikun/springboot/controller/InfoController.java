package com.akikun.springboot.controller;

import java.util.List;

import com.akikun.springboot.config.ConfigCenter;
import com.akikun.springboot.config.ProjectProperty;
import com.akikun.springboot.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    private final DBService dbService;

    public InfoController(DBService dbService) {
        this.dbService = dbService;
    }

    @RequestMapping("/project")
    public ProjectProperty project() {
        ProjectProperty projectConf = ConfigCenter.getProject();
        System.err.println(projectConf.toString());
        return projectConf;
    }

    @RequestMapping("/tableNames")
    public List<String> tableNames() {
        return dbService.getAllTableNames();
    }

    @RequestMapping("/tableNums")
    public int tableNums() {
        return dbService.countTables();
    }

}
