package com.example.LeagueOfLegendsEsports.mapper;

import com.example.LeagueOfLegendsEsports.controller.resources.CommentatorResource;
import com.example.LeagueOfLegendsEsports.entity.Commentator;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(uses = GameMapper.class)
public interface CommentatorMapper {
    Commentator fromChampionResource(CommentatorResource commentatorResource);
    CommentatorResource toChampionResource(Commentator commentator);
    List<CommentatorResource> toChampionResources(List<Commentator> commentators);
}
