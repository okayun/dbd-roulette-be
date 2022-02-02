package com.backend.dbdroulette.Service;

import com.backend.dbdroulette.Model.Character;
import com.backend.dbdroulette.Repository.DbdRouletteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbdRouletteServiceImpl implements DbdRouletteService {
    private DbdRouletteRepository dbdRouletteRepository;

    public DbdRouletteServiceImpl(DbdRouletteRepository dbdRouletteRepository) {
        this.dbdRouletteRepository = dbdRouletteRepository;
    }

    @Override
    public List<Character> getAll() {
        return dbdRouletteRepository.getAll();
    }
}
