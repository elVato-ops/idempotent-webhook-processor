package com.elvato.webhook.event;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.Instant;
import java.util.UUID;

@Entity
public class IncomingEvent {
    @Id
    private UUID id;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

    private String payload;

    private Instant timestamp;

    @Enumerated(EnumType.STRING)
    private ProcessedStatus status;

    @Nullable
    private Instant processedAt;
}