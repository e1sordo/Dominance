package com.vlavik.dominance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "number_of_games")
    private int numberOfGames = 0;

    @Column(name = "number_of_wins")
    private int wins = 0;

    @Column(name = "wins_part")
    private double winsPart;

    @Column(name = "total_score")
    private long totalScore;

    @Column(name = "level")
    private int level;

    @Column(name = "global_ranking")
    private int globalRanking;
}
