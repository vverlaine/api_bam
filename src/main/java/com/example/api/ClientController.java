package com.example.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@Slf4j

public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/")
    public Flux<Client> getClient() {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Client>> getClientID(@PathVariable(value = "id") String id) {
        return (Mono<ResponseEntity<Client>>) clientRepository.findAllById(id).map(saveClient -> ResponseEntity.ok(saveClient));
    }
}
