package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.time.Clock
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

class User(
    val id: String,
    val firstName: String?,
    val lastName: String?,
    val avatar: String?,
    val rating: Int = 0,
    val respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false
) {
    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: String) : this(id, "John", "Doe")

    init {
//        if (((firstName == "") or (firstName == null))  or ((lastName == "") or (firstName == null))) println("Empty value. Enter first and last name") else
            println("It's Alive!!!\n" +
                    "${if (lastName === "Doe") "His name id $firstName $lastName" else "And his name is $firstName $lastName!!!"}\n")
    }

    companion object Factory {
        private var lastId : Int = -1
        fun makeUser(fullName:String?) : User{
            lastId++
            val (firstName, lastName) = Utils.parseFullName(fullName)
            return User(id = "$lastId", firstName = firstName, lastName = lastName)
    }
    }
}


