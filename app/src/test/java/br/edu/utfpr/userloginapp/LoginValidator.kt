package br.edu.utfpr.userloginapp
enum class LoginResult {
    SUCCESS,
    EMPTY_EMAIL,
    EMPTY_PASSWORD,
    PASSWORD_TOO_SHORT
}

object LoginValidator {
    fun isValid(email: String, password: String): LoginResult {
        if (email.isEmpty()) return LoginResult.EMPTY_EMAIL
        if (password.isEmpty()) return LoginResult.EMPTY_PASSWORD
        if (password.length < 6) return LoginResult.PASSWORD_TOO_SHORT
        return LoginResult.SUCCESS
    }
}