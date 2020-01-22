package com.lx.sp.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxing
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    /**
     * HELLO WORLD
     *
     * @return
     */
    @GetMapping
    public String hello() {
        return "HELLO WORLD";
    }
}
