package com.beerme.beerme.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(@Id var id: String?,
                var email: String,
                var senha: String){

}