package pe.edu.upc.swap.data.network.model

import java.time.LocalDate

class SignUpRequest(
    val name: String,
    val lastname: String,
    val email: String,
    val password: String,
    val birthday: String,
    val mobilephone: String,
    val description: String,
    val gender: String,
    val country: Int,
    val image: String,
    val languages: MutableList<Int>,
    val wishes: MutableList<Int>,
    val levels: MutableList<Int>
)