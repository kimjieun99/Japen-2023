package com.kimjieun99.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/home")
  public String home() {
    return "home"; //view page
  }

  @GetMapping("/introduce")
  public String introduce() {
    return "introduce";
  }
}
