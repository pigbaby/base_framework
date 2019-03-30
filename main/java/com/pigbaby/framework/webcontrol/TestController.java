package com.pigbaby.framework.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * TestController
 */
@Controller
public class TestController {

    @RequestMapping(value="/Test", method=RequestMethod.GET)
    public String testPage() {
        return "testpage";
    }
    
    @CrossOrigin
    @RequestMapping(value="/PageClip", method=RequestMethod.GET)
    public String pageClip() {
        return "xxyy";
    }
    
}