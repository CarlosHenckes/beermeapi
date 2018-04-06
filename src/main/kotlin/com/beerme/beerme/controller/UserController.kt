package com.beerme.beerme.controller

import com.beerme.beerme.model.User
import com.beerme.beerme.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    lateinit var userService : UserService

    @GetMapping("/email/{email}/senha/{senha}")
    fun login(@PathVariable(value = "email") email: String,
                @PathVariable(value = "senha") senha: String) : User?{
        return userService.login(email, senha)
    }

}