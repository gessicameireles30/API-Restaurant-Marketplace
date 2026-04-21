package com.gessicameireles.desafio_anotaai_backend.repositories;

import com.gessicameireles.desafio_anotaai_backend.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
