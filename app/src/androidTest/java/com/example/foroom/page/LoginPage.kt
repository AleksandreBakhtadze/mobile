package com.example.foroom.page

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import com.alternator.foroom.R

class LoginPage {

    val userNameInput = onView(withId(R.id.userNameInput))
    val passwordInput = onView(withId(R.id.passwordInput))
    val loginButton = onView(withId(R.id.logInButton))
    val signUpButton = onView(withId(R.id.signUpButton))

}
