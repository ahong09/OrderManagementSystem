package com.krew.restaurant.domain;

import com.krew.restaurant.util.DrinkTypeEnum;
import com.krew.restaurant.util.ItemTypeEnum;
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
    int tableNbr;
    LocalDateTime createDtm;
//    DrinkTypeEnum drinkType;
//    int drinkQuantity;

}
