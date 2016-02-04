package me.tomo.rest;

import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by usr0200379 on 15/10/02.
 */
@RestController
@RequestMapping(value = "/api")
public class HelloRestController {

    /**
     * testeest
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @Description("testetest")
    public String index() {
        return "Hello World!";
    }
}
