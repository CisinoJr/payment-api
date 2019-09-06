package br.com.cisinojr.paymentApi.domain

import javax.persistence.*

@Entity
@Table(name = "payments_user")
data class User(@Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                val id: Long = 0,
                val fullName: String = "",
                val email: String = "",
                val password: String = "",
                @OneToMany(mappedBy = "user",
                        cascade = [CascadeType.ALL],
                        fetch = FetchType.EAGER)
                val cards: Set<Card> = emptySet()
) {
}