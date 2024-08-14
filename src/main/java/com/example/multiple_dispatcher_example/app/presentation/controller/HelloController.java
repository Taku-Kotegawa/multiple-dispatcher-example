package com.example.multiple_dispatcher_example.app.presentation.controller;


import com.example.multiple_dispatcher_example.app.application.service.OrderService;
import com.example.multiple_dispatcher_example.app.domain.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final OrderService orderService;

    @RequestMapping("/")
    public Order hello() {

//        if(true){
//            throw new RuntimeException("aaa");
//        }

        return orderService.findByKey();
    }


}
