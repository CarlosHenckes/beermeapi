package com.beerme.beerme.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Beer(@Id var id: String?,
                var rotulo: String,
                var pais: String,
                var cervejaria: String,
                var teorAlcoolico: Float,
                var tipo: String,
                var urlRotulo: String?
                ) {

}