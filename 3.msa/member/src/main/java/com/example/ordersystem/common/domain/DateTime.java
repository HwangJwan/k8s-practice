package com.example.ordersystem.common.domain;

import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
public class DateTime {
    @UpdateTimestamp
    private LocalDateTime updatedTime;
}
