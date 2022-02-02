package com.backend.dbdroulette.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Park {
    // パークID
    private int id;

    // このパークを持つサバイバーまたはキラーのID
    private int ownerId;

    // パーク名
    private String name;

    // パークの画像パス
    private String path;

    // パーク説明
    private String note;
}
