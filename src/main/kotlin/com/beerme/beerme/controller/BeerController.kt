package com.beerme.beerme.controller

import com.sun.xml.internal.fastinfoset.util.StringArray
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/beer")
class BeerController {
    @GetMapping
    fun buscarTodos() : Array<String>{
        val list = arrayOf("carlos","marcus","carla","ailton","jose")
        return list
    }
}