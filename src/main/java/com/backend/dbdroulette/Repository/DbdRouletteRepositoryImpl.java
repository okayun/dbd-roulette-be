package com.backend.dbdroulette.Repository;

import com.backend.dbdroulette.Model.Character;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DbdRouletteRepositoryImpl implements DbdRouletteRepository {
    public List<Character> getAll() {
        return new ArrayList<>();
    }
}
