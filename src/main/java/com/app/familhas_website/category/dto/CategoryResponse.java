package com.app.familhas_website.category.dto;

import java.util.UUID;

import com.app.familhas_website.enums.EntityStatus;

public record CategoryResponse(
        UUID id,
        String title,
        EntityStatus status,
        String imageUrl,
        String description) {
}



