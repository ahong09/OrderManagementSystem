package com.krew.restaurant.dto;

import com.krew.restaurant.util.DrinkTypeEnum;
import com.krew.restaurant.util.ItemTypeEnum;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Item {
    ItemTypeEnum itemType;
    int itemQuantity;
//    DrinkTypeEnum drinkType;
//    int drinkQuantity;

}
