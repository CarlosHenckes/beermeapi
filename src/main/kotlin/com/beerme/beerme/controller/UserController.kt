package com.beerme.beerme.controller

import com.beerme.beerme.model.User
import com.beerme.beerme.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    lateinit var userService : UserService

    @GetMapping
    fun getAllUsers() :List<User>?{
        return userService.findAllUsers()
    }

    @GetMapping("/email/{email}/senha/{senha}")
    fun login(@PathVariable(value = "email") email: String,
                @PathVariable(value = "senha") senha: String) : Boolean{
        val user: User? = userService.login(email, senha)

        if (user != null){
            if (user.senha.equals(senha)){
                return true
            }
            return false
        }

        return false
    }

    @PostMapping
    fun salvar(@RequestBody user: User){
        userService.salvar(user)
    }

}