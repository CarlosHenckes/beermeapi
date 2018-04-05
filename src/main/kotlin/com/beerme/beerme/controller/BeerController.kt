package com.beerme.beerme.controller

import com.beerme.beerme.model.Beer
import com.sun.xml.internal.fastinfoset.util.StringArray
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import service.BeerService

@RestController
@RequestMapping("/beer")
class BeerController {

    /*@Autowired
    lateinit var beerService: BeerService*/

    @GetMapping
    fun buscarTodos() : List<Beer>{
        //return beerService.buscarTodasCervejas()
        val beer: List<Beer> = arrayListOf()
        return beer
    }
}