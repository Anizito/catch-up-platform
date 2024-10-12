/**
 * CreateFavoriteSourceCommand.java command
 *
 * @Summary
 * CreateFavoriteSourceCommand is a record class that represents a command to create a favorite source of news.
 */

package com.group.catchup.news.domain.model.commands;

public record CreateFavoriteSourceCommand(Long id, String name, String description) {
    public CreateFavoriteSourceCommand{
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("Id cannot be less than or equal to 0");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be null or blank");
        }
    }
}
