package com.example.multiple_dispatcher_example.webapi.presentation.controller;

import com.example.multiple_dispatcher_example.app.application.service.OrderService;
import com.example.multiple_dispatcher_example.app.domain.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestTestController {

    private final OrderService orderService;

    @RequestMapping("/order")
    public Order order() {

//        if (true) {
//            throw new RuntimeException("abc");
//        }

        return orderService.findByKey();
    }


}
