package me.tomo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by usr0200379 on 15/08/08.
 */
@Controller
public class HelloController {


    @RequestMapping(value = "/hello", method = GET)
    public String index(Map<String, Object> model) {

        model.put("title", "Hello");
        model.put("msg", "Hello World!!");

        return "index";
    }

}
