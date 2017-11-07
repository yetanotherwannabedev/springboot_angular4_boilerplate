package org.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewClass {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "hello world!";
    }
}
