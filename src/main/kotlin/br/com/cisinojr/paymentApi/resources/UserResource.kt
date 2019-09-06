package br.com.cisinojr.paymentApi.resources

import br.com.cisinojr.paymentApi.domain.User
import br.com.cisinojr.paymentApi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api/users")
class UserResource(@Autowired private val userRepository: UserRepository) {

    @PostMapping
    fun save(@Valid @RequestBody user: User) : User = userRepository.save(user)

    @GetMapping
    fun findAll(): List<User> = userRepository.findAll()

}