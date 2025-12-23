package com.in28minutes.rest.webservices.restful_web_services.helloworld;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {
    private MessageSource messageSource;

    @Autowired
    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping(path = "/hello-world")
//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String heloWrold() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-inter")
    public String heloWroldInternationalized() {
        Locale local = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default message", local);
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean heloWroldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world-path-variable/{name}")
    public HelloWorldBean heloWroldPathVariable(@PathVariable String name) {
        return new HelloWorldBean("Hello World " + name);
    }
}
