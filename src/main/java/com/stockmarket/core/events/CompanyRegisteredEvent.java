package com.stockmarket.core.events;

import com.stockmarket.core.enums.Events;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyRegisteredEvent extends DomainEvent {
    private String companyName;
    private String companyCode;
    private String companyCEO;
    private Double companyTurnover;
    private String companyWebsite;
    private String stockExchange;

    public CompanyRegisteredEvent(String aggregateId, String aggregateType, String companyName, String companyCode,
                                  String companyCEO, Double companyTurnover, String companyWebsite, String stockExchange) {
        super(aggregateId, aggregateType, Events.COMPANY_REGISTERED_EVENT.getValue());
        this.companyName = companyName;
        this.companyCode = companyCode;
        this.companyCEO = companyCEO;
        this.companyTurnover = companyTurnover;
        this.companyWebsite = companyWebsite;
        this.stockExchange = stockExchange;
    }
}
