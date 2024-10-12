package com.group.catchup.news.application;

import com.group.catchup.news.domain.model.aggregates.FavoriteSource;
import com.group.catchup.news.domain.model.commands.CreateFavoriteSourceCommand;
import com.group.catchup.news.domain.model.commands.DeleteFavoriteSourceByIdCommand;
import com.group.catchup.news.domain.model.commands.UpdateFavoriteSourceByIdCommand;
import com.group.catchup.news.domain.services.FavoriteSourceCommandService;

import java.util.Optional;

public class FavoriteSourceCommandServiceImpl implements FavoriteSourceCommandService {
    @Override
    public Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command) {
        return Optional.empty();
    }

    @Override
    public Optional<FavoriteSource> handle(DeleteFavoriteSourceByIdCommand command) {
        return Optional.empty();
    }

    @Override
    public Optional<FavoriteSource> handle(UpdateFavoriteSourceByIdCommand command) {
        return Optional.empty();
    }
}
