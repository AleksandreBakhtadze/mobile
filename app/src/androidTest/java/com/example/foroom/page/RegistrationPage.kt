package com.example.foroom.page

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import com.alternator.foroom.R

class RegistrationPage {

    val userNameInput = onView(withId(R.id.userNameInput))
    val passwordInput = onView(withId(R.id.passwordInput))
    val repeatPasswordInput = onView(withId(R.id.repeatPasswordInput))
    val signUpButton = onView(withId(R.id.signUpButton))
    val logInTextView = onView(withId(R.id.logInTextView))

}
