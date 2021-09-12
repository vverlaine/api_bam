package com.example.api;

import com.mongodb.client.MongoIterable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client,String> {
    MongoIterable<Object> findAllById(String id);
}
