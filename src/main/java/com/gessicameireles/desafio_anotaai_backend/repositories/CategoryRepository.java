package com.gessicameireles.desafio_anotaai_backend.repositories;

import com.gessicameireles.desafio_anotaai_backend.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}