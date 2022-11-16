package com.example.kakaopay.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class PayController {

    @GetMapping("/pay")
    public void pay() {
        log.info("pay");
    }

}
