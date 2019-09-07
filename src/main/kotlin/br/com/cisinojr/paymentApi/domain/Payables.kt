package br.com.cisinojr.paymentApi.domain

import java.time.Instant
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
data class Payables(@Id
                    @GeneratedValue(
                            strategy = GenerationType.IDENTITY) val id: Long = 0,
                    @get: NotNull val paid: Boolean = false,
                    @get: NotNull val waitingFunds: Boolean = false,
                    @get: NotNull val paymentDate: Instant) {
}