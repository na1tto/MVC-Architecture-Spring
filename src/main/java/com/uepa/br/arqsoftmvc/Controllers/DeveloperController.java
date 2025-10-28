package com.uepa.br.arqsoftmvc.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

    @GetMapping("/oi")
    public String oi(){
        return "oi";
    }

}
