package com.stockmarket.core.events;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
public abstract class DomainEvent implements Serializable {
    private String eventId;
    private String aggregateId;
    private String aggregateType;
    private String name;
    private Integer aggregateVersion;
    private Instant generatedDate;

    public DomainEvent(String aggregateId, String aggregateType, String name, Integer aggregateVersion) {
        this.eventId = UUID.randomUUID().toString();
        this.aggregateId = aggregateId;
        this.aggregateType = aggregateType;
        this.name = name;
        this.aggregateVersion = aggregateVersion;
        this.generatedDate = Instant.now();
    }

    public DomainEvent(String aggregateId, String aggregateType, String name) {
        this.eventId = UUID.randomUUID().toString();
        this.aggregateId = aggregateId;
        this.aggregateType = aggregateType;
        this.name = name;
        this.generatedDate = Instant.now();
    }
}
