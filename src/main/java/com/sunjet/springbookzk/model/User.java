package com.sunjet.springbookzk.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    public String username;
    public String picture;
}