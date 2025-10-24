package com.example.foroom.steps

import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.Espresso.onView
import com.example.foroom.page.RegistrationPage

class RegistrationSteps(private val page: RegistrationPage = RegistrationPage()) {

    fun typeUserName(name: String): RegistrationSteps {
        page.userNameInput.perform(clearText(), typeText(name), closeSoftKeyboard())
        return this
    }

    fun typePassword(password: String): RegistrationSteps {
        page.passwordInput.perform(clearText(), typeText(password), closeSoftKeyboard())
        return this
    }

    fun typeRepeatPassword(password: String): RegistrationSteps {
        page.repeatPasswordInput.perform(clearText(), typeText(password), closeSoftKeyboard())
        return this
    }

    fun clickSignUp(): RegistrationSteps {
        page.signUpButton.perform(click())
        return this
    }

    fun clickGoToLogin(): RegistrationSteps {
        page.logInTextView.perform(click())
        return this
    }

    fun registerNewUser(name: String, password: String): RegistrationSteps {
        typeUserName(name)
        typePassword(password)
        typeRepeatPassword(password)
        clickSignUp()
        return this
    }

    fun checkUserRegistered(): RegistrationSteps {
        onView(withText("Registration successful")).check(matches(isDisplayed()))
        return this
    }
}
