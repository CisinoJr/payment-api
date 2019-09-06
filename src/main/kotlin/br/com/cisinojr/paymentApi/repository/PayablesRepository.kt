package br.com.cisinojr.paymentApi.repository

import br.com.cisinojr.paymentApi.domain.Payables
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PayablesRepository : JpaRepository<Payables, Long> {
}