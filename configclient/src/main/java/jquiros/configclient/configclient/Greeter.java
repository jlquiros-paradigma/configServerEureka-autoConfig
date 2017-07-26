package jquiros.configclient.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RefreshScope
public class Greeter {

    @Value("${message.greeting}")
    String greeting;

    @Value("${server.port}")
    int port;

    @Value("${configuration.projectName}")
    String projectName;

    @Value("${user.role}")
    String role;

    @Value ("${security.user.password}")
    String pass;

    @Value ("${security.user.name}")
    String user;


    @RequestMapping(value = "/", produces = "application/json")
    @RefreshScope
    public List<String> index(){
        List<String> env = Arrays.asList(
                "message.greeting is: " + greeting,
                "server.port is: " + port,
                "configuration.projectName is: " + projectName,
                "role: " + role,
                "pass: " + pass,
                "user:" + user
        );
        return env;
    }

    @RequestMapping (value = "/checkPass/{pass}")
    public String checkPass(@PathVariable String pass)
    {
        return this.pass.equals(pass)?"OK":"KO";
    }
}