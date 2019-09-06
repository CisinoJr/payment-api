package br.com.cisinojr.paymentApi.repository

import br.com.cisinojr.paymentApi.domain.Card
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CardRepository : JpaRepository<Card, Long> {
}