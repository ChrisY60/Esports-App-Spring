package com.example.LeagueOfLegendsEsports.controller;

import com.example.LeagueOfLegendsEsports.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/players")
@RequiredArgsConstructor
public class PlayerController {
    PlayerService playerService;

    @GetMapping
    public String findAll() {
        return playerService.findAll().toString();
    }
}
