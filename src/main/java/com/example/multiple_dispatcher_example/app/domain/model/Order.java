package com.example.multiple_dispatcher_example.app.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

@Data
@Builder
public class Order {

    private String fieldString;
    private Integer fieldInteger;

    private LocalDate fieldLocalDate; // 2024-08-14

//    // LocalDateTimeに'+09:00'を追加する方法
//    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'+09:00'")
    private LocalDateTime fieldLocalDateTime; // 2024-08-14T08:05:11.31082746

    private OffsetDateTime fieldOffsetDateTime; // 2024-08-14T08:04:52.464699374+09:00

    private Date fieldDate; // 2024-08-14 UTC

    private Timestamp fieldTimestamp; // 2024-08-13T23:05:11.310+00:00

    private String fieldNull;
    private BigDecimal fieldBigDecimal;
    private Float fieldFloat;

}
