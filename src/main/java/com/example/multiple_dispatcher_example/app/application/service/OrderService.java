package com.example.multiple_dispatcher_example.app.application.service;

import com.example.multiple_dispatcher_example.app.domain.model.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.*;

@Service
public class OrderService {

    public Order findByKey() {

        var now = LocalDateTime.now();

        return Order.builder()
                .fieldString("Hello World!")
                .fieldInteger(100)
                .fieldLocalDate(LocalDate.now())
                .fieldLocalDateTime(now)
                .fieldOffsetDateTime(now.atZone(ZoneId.systemDefault()).toOffsetDateTime())
                .fieldDate(Date.valueOf(now.toLocalDate()))
                .fieldTimestamp(Timestamp.valueOf(now))
                .fieldNull(null)
                .fieldBigDecimal(new BigDecimal("10.01"))
                .fieldFloat(10.1F)
                .build();
    }

}
