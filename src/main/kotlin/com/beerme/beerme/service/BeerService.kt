package com.beerme.beerme.service

import com.beerme.beerme.model.Beer
import com.beerme.beerme.repository.BeerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BeerService {

    @Autowired
    lateinit var beerRepository: BeerRepository

    fun buscarTodasCervejas() : List<Beer>{
        return beerRepository.findAll()
    }
}