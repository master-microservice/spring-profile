package mis.profile.springprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @Autowired
    private Environment environment;

    @GetMapping
    public String welcome() {
        return "Welcome to Spring profiling";
    }
    @GetMapping({"/profile"})
    public String[] checkProfile() {
        return environment.getActiveProfiles();
    }

    @GetMapping({"/msg"})
    public String getMsg() {
        return "Auth-By-Passed";
    }

}
