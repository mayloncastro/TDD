import org.junit.Assert.assertEquals
import org.junit.Test

class LoginValidatorTest {

    @Test
    fun emailAndPasswordAreValid() {
        val result = LoginValidator.isValid("user@example.com", "password123")
        assertEquals(LoginResult.SUCCESS, result)
    }

    @Test
    fun emailIsEmpty() {
        val result = LoginValidator.isValid("", "password123")
        assertEquals(LoginResult.EMPTY_EMAIL, result)
    }

    @Test
    fun passwordIsEmpty() {
        val result = LoginValidator.isValid("user@example.com", "")
        assertEquals(LoginResult.EMPTY_PASSWORD, result)
    }

    @Test
    fun passwordIsTooShort() {
        val result = LoginValidator.isValid("user@example.com", "pass")
        assertEquals(LoginResult.PASSWORD_TOO_SHORT, result)
    }
}