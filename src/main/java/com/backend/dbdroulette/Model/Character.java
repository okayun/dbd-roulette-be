package com.backend.dbdroulette.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Character {
    // キャラクターID
    private int id;

    // キャラクター名
    private String name;

    // サバイバー固有のパーク
    private List<Park> parks;
}
