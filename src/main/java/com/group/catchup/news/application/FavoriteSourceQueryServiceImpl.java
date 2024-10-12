/**
 * FavoriteSourceQueryServiceImpl.java
 *
 * @Summary
 * FavoriteSourceQueryServiceImpl is a class that implements the FavoriteSourceQueryService interface.
 */
package com.group.catchup.news.application;

import com.group.catchup.news.domain.model.aggregates.FavoriteSource;
import com.group.catchup.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import com.group.catchup.news.domain.model.queries.GetFavoriteSourceQuery;
import com.group.catchup.news.domain.services.FavoriteSourceQueryService;

import java.util.List;
import java.util.Optional;

public class FavoriteSourceQueryServiceImpl implements FavoriteSourceQueryService {

    @Override
    public Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query) {
        return Optional.empty();
    }

    @Override
    public Optional<List<FavoriteSource>> handle(GetFavoriteSourceQuery query) {
        return Optional.empty();
    }
}
