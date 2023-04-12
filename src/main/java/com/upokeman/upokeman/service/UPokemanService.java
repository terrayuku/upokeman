package com.upokeman.upokeman.service;


import com.upokeman.upokeman.models.PokemanResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class UPokemanService {

    @Value ("${upokeman.all.endpoint}")
    private String endpoint;

    @Autowired
    RestTemplate restTemplate;

    public PokemanResponse getAllPokemans() {
        try {
            ResponseEntity<PokemanResponse> response = restTemplate.getForEntity(String.format(endpoint,"pokemon"), PokemanResponse.class);
            return response.getBody();

        } catch (HttpClientErrorException errorException) {
            log.debug("Error Exception {} ", errorException.getMessage());
            throw new HttpClientErrorException(errorException.getStatusCode());
        }
    }

}
