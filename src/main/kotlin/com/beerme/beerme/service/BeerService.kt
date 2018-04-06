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
        /*val beer: List<Beer> = arrayListOf()
        return beer*/
        return beerRepository.findAll()
    }

    fun salvar(beer: Beer){
        beerRepository.save(beer)
    }

    fun excluir(beer: Beer){
        beerRepository.delete(beer)
    }

    fun atualizar(beer: Beer){
        beerRepository.save(beer)
    }

    fun pesquisarPorRotulo(rotulo: String) : List<Beer>?{
        return beerRepository.findByRotuloContaining(rotulo)
    }
}