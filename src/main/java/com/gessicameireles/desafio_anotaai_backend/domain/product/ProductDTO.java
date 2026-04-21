package com.gessicameireles.desafio_anotaai_backend.domain.product;

public record ProductDTO(String title, String description, String ownerId, Integer price, String categoryId) {
}