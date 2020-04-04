package com.brugier.profiling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private AppVersion appVersion;

    @RequestMapping("/hello")
    public String hello(){
        return appVersion.getVersion();
    }
}
