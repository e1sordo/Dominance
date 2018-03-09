package com.vlavik.dominance.model;

import com.vlavik.dominance.model.enums.GameStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private User player;

    @Enumerated(EnumType.STRING)
    private GameStatus gameStatus;

    // todo
    private Arena arena;

    @Column(name = "created_date", nullable = false)
    private Date created;
}
