package com.sunjet.springbookzk.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    public User author;
    public String content;
}