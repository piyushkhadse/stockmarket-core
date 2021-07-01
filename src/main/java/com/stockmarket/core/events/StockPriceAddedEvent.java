package com.stockmarket.core.events;

import com.stockmarket.core.enums.Events;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StockPriceAddedEvent extends DomainEvent {
    private String companyCode;
    private Double stockPrice;

    public StockPriceAddedEvent(String aggregateId, String aggregateType,
                                String companyCode, Double stockPrice) {
        super(aggregateId, aggregateType, Events.STOCK_PRICE_ADDED_EVENT.getValue());
        this.companyCode = companyCode;
        this.stockPrice = stockPrice;
    }
}
