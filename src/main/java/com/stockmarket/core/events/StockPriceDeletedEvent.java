package com.stockmarket.core.events;

import com.stockmarket.core.enums.Events;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StockPriceDeletedEvent extends DomainEvent {
    private String companyCode;

    public StockPriceDeletedEvent(String aggregateId, String aggregateType, String companyCode) {
        super(aggregateId, aggregateType, Events.STOCK_PRICE_DELETED_EVENT.getValue());
        this.companyCode = companyCode;
    }

}
