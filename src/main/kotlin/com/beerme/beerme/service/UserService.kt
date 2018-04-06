package com.beerme.beerme.service

import com.beerme.beerme.model.User
import com.beerme.beerme.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun login(email: String, senha: String) : User? {
        return userRepository.findByEmailContaining(email)
    }
}