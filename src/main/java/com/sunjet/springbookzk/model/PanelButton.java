package com.sunjet.springbookzk.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PanelButton {
 
    private String btnID;
    private String btnIcon;
    private String btnClass;
    private String btnCommand;
 
}