package com.pigbaby.framework.testpackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestRestful
 */
@RestController
public class TestRestful {
    @RequestMapping(value="/TestRest", method = RequestMethod.GET)
    public String testRestful(){
        return "I am coming";
    }
}