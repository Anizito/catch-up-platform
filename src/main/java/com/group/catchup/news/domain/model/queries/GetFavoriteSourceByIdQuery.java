/**
 * GetFavoriteSourceByIdQuery.java query
 *
 * @Summary
 * GetFavoriteSourceByIdQuery is a record class that represents a query to get a favorite source of news by id.
 */


package com.group.catchup.news.domain.model.queries;

public record GetFavoriteSourceByIdQuery(Long id) {
    public GetFavoriteSourceByIdQuery{
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("Id cannot be less than or equal to 0");
        }
    }
}
