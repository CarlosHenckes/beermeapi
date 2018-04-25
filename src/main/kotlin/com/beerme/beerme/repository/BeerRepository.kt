package com.beerme.beerme.repository

import com.beerme.beerme.model.Beer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BeerRepository: MongoRepository<Beer, String> {
    fun findByRotuloContainingIgnoreCase(rotulo: String): List<Beer>?
    fun findAllByOrderByIdDesc(): List<Beer>
}
