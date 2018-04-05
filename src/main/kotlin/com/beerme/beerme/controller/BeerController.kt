package com.beerme.beerme.controller

import com.beerme.beerme.model.Beer
import com.beerme.beerme.service.BeerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/beer")
class BeerController {

    @Autowired
    lateinit var beerService: BeerService

    @GetMapping
    fun buscarTodos() : List<Beer>{
        return beerService.buscarTodasCervejas()
    }
}