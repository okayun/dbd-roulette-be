package com.backend.dbdroulette.Service;

import com.backend.dbdroulette.Model.Character;
import com.backend.dbdroulette.Repository.DbdRouletteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DbdRouletteService {

    public List<Character> getAll();
}
