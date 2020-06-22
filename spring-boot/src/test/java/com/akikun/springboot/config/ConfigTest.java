package com.akikun.springboot.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConfigTest {

    @Value("${project.name}")
    private String projectName;

    @Value("${project.author}")
    private String projectAuthor;

    @Value("${project.url}")
    private String projectUrl;

    @Test
    public void testProjectInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Project info: ").append('[').append("\n");
        sb.append("    name: ").append(projectName).append(',').append("\n");
        sb.append("    author: ").append(projectAuthor).append(',').append("\n");
        sb.append("    url: ").append(projectUrl).append("\n");
        sb.append(']');
        System.err.println(sb.toString());
    }
}
