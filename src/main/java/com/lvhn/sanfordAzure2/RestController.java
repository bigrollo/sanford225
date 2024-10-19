package com.lvhn.sanfordAzure2;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String index(){
        return "Welcome to the Dagobah System";
    }
}
