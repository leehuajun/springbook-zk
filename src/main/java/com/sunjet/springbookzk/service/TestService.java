package com.sunjet.springbookzk.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TestService {
    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }
}
