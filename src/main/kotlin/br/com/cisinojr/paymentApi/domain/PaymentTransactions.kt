package br.com.cisinojr.paymentApi.domain

import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class PaymentTransactions(@Id
                        @GeneratedValue(
                                strategy = GenerationType.IDENTITY) val id: Long = 0,
                               @get: NotBlank val name: String = "",
                               @get: NotBlank val description: String = "",
                               @get: NotNull val value: Double,

                               @ManyToOne(fetch = FetchType.EAGER)
                        @JoinColumn(name = "card_id")
                        @get: NotNull var card: Card
) {
}