package pl.szarlus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by karol on 03.12.2017.
 */
@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping(
            value = {"/", "/home"},
            method = RequestMethod.GET)
    public String helloAction() {
        return "Hello world!";
    }

}
