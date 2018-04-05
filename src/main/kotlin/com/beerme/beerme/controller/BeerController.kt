package com.beerme.beerme.controller

import com.beerme.beerme.model.Beer
import com.beerme.beerme.service.BeerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/beer")
class BeerController {

    @Autowired
    lateinit var beerService: BeerService

    @GetMapping
    fun buscarTodos() : List<Beer>{
        return beerService.buscarTodasCervejas()
    }

    @PostMapping
    fun salvar(@RequestBody beer: Beer){
        beerService.salvar(beer)
    }

    @DeleteMapping
    fun excluir(@RequestBody beer: Beer){
        beerService.excluir(beer)
    }

    @PutMapping
    fun atualizar(@RequestBody beer: Beer){
        beerService.atualizar(beer)
    }

    @GetMapping("/rotulo/{rotulo}")
    fun pesquisarPorRotulo(@PathVariable(value = "rotulo") rotulo: String): List<Beer>{
        return beerService.pesquisarPorRotulo(rotulo)
    }
}