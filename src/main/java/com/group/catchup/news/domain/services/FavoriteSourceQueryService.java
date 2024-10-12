/**
 * FavoriteSourceQueryService.java service
 *
 * @Summary
 * FavoriteSourceQueryService is an interface that represents a service for favorite source queries.
 */

package com.group.catchup.news.domain.services;

import com.group.catchup.news.domain.model.aggregates.FavoriteSource;
import com.group.catchup.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import com.group.catchup.news.domain.model.queries.GetFavoriteSourceQuery;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceQueryService {
    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);
    Optional<List<FavoriteSource>> handle(GetFavoriteSourceQuery query);
}
