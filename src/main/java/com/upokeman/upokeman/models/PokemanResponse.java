package com.upokeman.upokeman.models;

import java.util.List;

public class PokemanResponse {

    List<Pokeman> results;

    public List<Pokeman> getResults() {
        return results;
    }

    public void setResults(List<Pokeman> results) {
        this.results = results;
    }
}
