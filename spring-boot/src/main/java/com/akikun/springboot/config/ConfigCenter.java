package com.akikun.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigCenter {

    private static Environment env;

    private static ProjectProperty projectProperty;

    @Autowired
    private ConfigCenter(Environment env){
        this.env = env;
    }

    public static ProjectProperty getProject() {
        if (projectProperty == null) {
            synchronized (ConfigCenter.class) {
                if (projectProperty == null) {
                    projectProperty = Binder.get(env)
                            .bind("project", Bindable.of(ProjectProperty.class))
                            .get();
                }
            }
        }
        return projectProperty;
    }
}
