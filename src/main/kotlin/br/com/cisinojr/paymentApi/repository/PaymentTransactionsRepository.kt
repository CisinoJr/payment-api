package br.com.cisinojr.paymentApi.repository

import br.com.cisinojr.paymentApi.domain.PaymentTransactions
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentTransactionsRepository : JpaRepository<PaymentTransactions, Long> {
}