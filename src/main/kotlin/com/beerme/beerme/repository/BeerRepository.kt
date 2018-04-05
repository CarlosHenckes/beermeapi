package com.beerme.beerme.repository

import com.beerme.beerme.model.Beer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BeerRepository: MongoRepository<Beer, String> {
    //fun findByRotuloContaining(rotulo: String): List<Beer>
}