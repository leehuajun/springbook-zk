package com.sunjet.springbookzk.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatBox {
    private String id;
    private String title;
    private String value;
    private String icon;
    private String style;

}