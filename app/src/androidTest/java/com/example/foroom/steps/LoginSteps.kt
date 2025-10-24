package com.example.foroom.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.foroom.page.LoginPage

class LoginSteps(private val page: LoginPage = LoginPage()) {

    fun enterInvalidName() {
        page.userNameInput.perform(clearText(), typeText("invalid_user"), closeSoftKeyboard())
        page.passwordInput.perform(clearText(), typeText("ValidPass123"), closeSoftKeyboard())
        page.loginButton.perform(click())
    }

    fun checkInvalidNameError() {
        onView(withText("Invalid username")).check(matches(isDisplayed()))
    }

    fun enterInvalidPassword() {
        page.userNameInput.perform(clearText(), typeText("validUser"), closeSoftKeyboard())
        page.passwordInput.perform(clearText(), typeText("123"), closeSoftKeyboard())
        page.loginButton.perform(click())
    }

    fun checkInvalidPasswordError() {
        onView(withText("Invalid password")).check(matches(isDisplayed()))
    }

    fun clickSignUpButton() {
        page.signUpButton.perform(click())
    }
}
