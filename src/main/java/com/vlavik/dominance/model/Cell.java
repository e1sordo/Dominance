package com.vlavik.dominance.model;

import com.vlavik.dominance.model.enums.CellType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// @Check() .. ???
public class Cell {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CellType cellType;

    @Column(name = "current_occupancy", nullable = false)
    private int currentOccupancy = 0;

    @Column(name = "player_number", nullable = false)
    private int playerNumber;
}
