package com.backend.dbdroulette.Controller;

import com.backend.dbdroulette.Model.Character;
import com.backend.dbdroulette.Service.DbdRouletteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dbd/roulette")
public class DbdRouletteController {

    private DbdRouletteService dbdRouletteService;

    public DbdRouletteController(DbdRouletteService dbdRouletteService) {
        this.dbdRouletteService = dbdRouletteService;
    }

    @GetMapping("all")
    @ResponseBody
    public List<Character> getAll() {
        return this.dbdRouletteService.getAll();
    }

}
