package com.example.api;

import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;
import reactor.core.publisher.Flux;

public class ClientHandler {

    private ClientRepository clientRepository;

    public ClientHandler(ClientRepository clientRepository){
        super();
        this.clientRepository = clientRepository;
    }

    public ServerResponse getClientAll(ServerRequest request){
        Flux<Client> client = clientRepository.findAll();
        return ServerResponse.ok().body(client);
    }
}
