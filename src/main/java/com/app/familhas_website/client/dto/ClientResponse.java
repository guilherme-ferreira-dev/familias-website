package com.app.familhas_website.client.dto;

import com.app.familhas_website.enums.EntityStatus;

import java.util.List;
import java.util.UUID;

public record ClientResponse(
        UUID id,
        String name,
        String email,
        String phoneNumber,
        EntityStatus status,
        List<UUID> favoriteIds,
        List<UUID> myFlightIds) {

    }
