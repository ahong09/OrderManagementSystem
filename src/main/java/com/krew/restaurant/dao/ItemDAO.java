package com.krew.restaurant.dao;

import com.krew.restaurant.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class ItemDAO {
    @Autowired
    private NamedParameterJdbcTemplate template;

    /**
     * Insert the {@link Item}.
     *
     * @param item
     * @return
     */
    public int insert(Item item){
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("itemType", item.getItemType());
        param.addValue("quantity", item.getItemQuantity());
        param.addValue("tableNbr", item.getTableNbr());
        param.addValue("createDtm", LocalDateTime.now());

        return template.update("INSERT INTO item VALUES (:itemType, :quantity, :tableNbr, :createDtm)", param);
    }

    /**
     * Retrieve the order based on the table number.
     *
     * NOTE: This will not work.. we will need to implement some sort of Order #.
     *
     * @param tableNbr The table number of order.
     * @return The list of {@link Item} for the order.
     */
    public List<Item> get(Integer tableNbr){
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("tableNbr", tableNbr);
        return template.query("SELECT * FROM item WHERE table_nbr = :tableNbr", param, (rs, i) ->
                Item.builder().itemType(rs.getString("ITEM_TYPE"))
                    .itemQuantity(rs.getInt("QUANTITY"))
                    .tableNbr(rs.getInt("TABLE_NBR"))
                    .createDtm(rs.getTimestamp("CREATE_DTM").toLocalDateTime())
                    .build());
    }

}
