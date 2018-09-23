package com.salesmore.yak.integration.shopee.model.item.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.salesmore.yak.integration.shopee.model.BaseRequest;
import com.salesmore.yak.integration.shopee.model.item.Variation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ItemUpdateBatch extends BaseRequest {

    /**
     * The variation of item is to list out all models of this product
     */
    @Singular
    List<ItemUpdate> items;

    @Data
    public static class ItemUpdate {

        @JsonProperty("item_id")
        private Long id;

        /**
         * Specify the revised price of the item.
         */
        @JsonInclude(JsonInclude.Include.NON_DEFAULT)
        private float price;

        /**
         * Specify the revised stock quantity of the item.
         */
        @JsonInclude(JsonInclude.Include.NON_DEFAULT)
        private Long stock;
    }

}
