package com.brugier.AutoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private DataBaseProperties dataBaseProperties;

    @RequestMapping("/getConnectionParam")
    public String showConnectionParam() {
        return "host: " + dataBaseProperties.getHost()
                + " port: " + dataBaseProperties.getPort()
                + " username: " + dataBaseProperties.getUsername()
                + " userpass: " + dataBaseProperties.getUserpass();
    }
}
