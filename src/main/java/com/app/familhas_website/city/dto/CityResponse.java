package com.app.familhas_website.city.dto;

import java.util.UUID;

import com.app.familhas_website.enums.CityType;
import com.app.familhas_website.enums.EntityStatus;

public record CityResponse(
        UUID id,
        String name,
        String country,
        CityType cityType,
        EntityStatus status) {
}



