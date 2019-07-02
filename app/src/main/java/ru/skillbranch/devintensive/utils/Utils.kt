package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        val parts : List<String>? = fullName?.split( " ")
        var firstName = parts?.getOrNull(index = 0)
        var lastName = parts?.getOrNull(index = 1)
        if ((firstName == null) or (firstName == "") or (firstName == " ")) firstName = null else firstName === firstName
        if ((lastName == null) or (lastName == "") or (lastName == " ")) lastName = null else lastName === lastName
        return firstName to lastName
    }
}