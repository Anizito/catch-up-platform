/**
 * FavoriteSourceCommandService.java service
 *
 * @Summary
 * FavoriteSourceCommandService is an interface that represents a service for favorite source commands.
 */

package com.group.catchup.news.domain.services;

import com.group.catchup.news.domain.model.aggregates.FavoriteSource;
import com.group.catchup.news.domain.model.commands.CreateFavoriteSourceCommand;
import com.group.catchup.news.domain.model.commands.DeleteFavoriteSourceByIdCommand;
import com.group.catchup.news.domain.model.commands.UpdateFavoriteSourceByIdCommand;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface FavoriteSourceCommandService {
    Optional<FavoriteSource> handle (CreateFavoriteSourceCommand command);
    Optional<FavoriteSource> handle (DeleteFavoriteSourceByIdCommand command);
    Optional<FavoriteSource> handle (UpdateFavoriteSourceByIdCommand command);
}
