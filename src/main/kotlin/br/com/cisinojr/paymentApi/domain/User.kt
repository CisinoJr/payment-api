package br.com.cisinojr.paymentApi.domain

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "payments_user")
data class User(@Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                val id: Long = 0,
                @get: NotBlank val fullName: String = "",
                @get: NotBlank val email: String = "",
                @get: NotBlank val password: String = "",
                @OneToMany(mappedBy = "user",
                        cascade = [CascadeType.ALL],
                        fetch = FetchType.EAGER)
                val cards: Set<Card> = emptySet()
) {
}