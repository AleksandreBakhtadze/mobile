package com.example.foroom.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.foroom.presentation.ui.activity.ForoomActivity
import com.example.foroom.steps.RegistrationSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RegistrationTests {

    @get:Rule
    val activityRule = ActivityScenarioRule(ForoomActivity::class.java)

    private val registrationSteps = RegistrationSteps()

    @Test
    fun testUserCanRegisterSuccessfully() {
        registrationSteps.registerNewUser("newUser123", "StrongPassword!23")
        registrationSteps.checkUserRegistered()
    }
}
