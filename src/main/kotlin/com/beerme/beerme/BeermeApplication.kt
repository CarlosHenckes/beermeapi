package com.beerme.beerme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeermeApplication

fun main(args: Array<String>) {
    runApplication<BeermeApplication>(*args)
}
