package com.example.hexagonal.post.adapter.in.web.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class DetailResponse {
    private Long id;
    private String content;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
