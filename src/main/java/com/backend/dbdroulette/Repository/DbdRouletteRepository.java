package com.backend.dbdroulette.Repository;

import com.backend.dbdroulette.Model.Park;
import com.backend.dbdroulette.Model.Character;
import org.springframework.stereotype.Repository;

import java.util.*;

public interface DbdRouletteRepository {

    public List<Character> getAll();
}
