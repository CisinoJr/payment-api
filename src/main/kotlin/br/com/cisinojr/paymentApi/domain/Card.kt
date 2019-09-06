package br.com.cisinojr.paymentApi.domain

import br.com.cisinojr.paymentApi.enums.CardType
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
data class Card(@Id
                @GeneratedValue(
                        strategy = GenerationType.IDENTITY) val id: Long = 0,
                @get: NotNull var cardNumber: String,
                @get: NotNull var ownerName: String,
                @get: NotNull var verificationCode: Int,
                @get: NotNull var validationDate: Date,
                @get: NotNull var cardType: CardType,

                @ManyToOne(fetch = FetchType.EAGER)
                @JoinColumn(name = "user_id")
                @get: NotNull var user: User
) {
}