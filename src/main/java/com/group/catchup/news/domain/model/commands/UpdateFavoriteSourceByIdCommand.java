package com.group.catchup.news.domain.model.commands;

public record UpdateFavoriteSourceByIdCommand(Long id) {
    public UpdateFavoriteSourceByIdCommand{
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("Id cannot be less than or equal to 0");
        }
    }
}
