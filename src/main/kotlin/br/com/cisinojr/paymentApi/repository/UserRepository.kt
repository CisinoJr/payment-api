package br.com.cisinojr.paymentApi.repository

import br.com.cisinojr.paymentApi.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
}