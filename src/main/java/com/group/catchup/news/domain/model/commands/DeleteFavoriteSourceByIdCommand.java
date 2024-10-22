/**
 * DeleteFavoriteSourceByIdCommand.java command
 *
 * @Summary
 * DeleteFavoriteSourceByIdCommand is a record class that represents a command to delete a favorite source of news by id.
 */
package com.group.catchup.news.domain.model.commands;

public record DeleteFavoriteSourceByIdCommand(Long id) {
    public DeleteFavoriteSourceByIdCommand{
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("Id cannot be less than or equal to 0");
        }
    }
}
