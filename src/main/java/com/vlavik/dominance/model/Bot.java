package com.vlavik.dominance.model;

import com.vlavik.dominance.model.enums.DifficultyLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bot {

    private DifficultyLevel difficultyLevel;
}
