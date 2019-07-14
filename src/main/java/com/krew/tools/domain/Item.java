package com.krew.tools.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Item {
    String itemType;
    int itemQuantity;
    LocalDateTime createDtm;
}
