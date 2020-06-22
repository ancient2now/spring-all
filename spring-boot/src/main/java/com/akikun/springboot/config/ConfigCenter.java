package com.akikun.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigCenter {

    private final Environment env;

    private final Binder binder;

    @Autowired
    private ConfigCenter(Environment env){
        this.env = env;
        binder = Binder.get(env);
    }

    public ProjectConfig getProject() {
        return binder.bind("project", Bindable.of(ProjectConfig.class)).get();
    }
}
