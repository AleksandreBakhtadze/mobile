package com.example.foroom.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.foroom.presentation.ui.activity.ForoomActivity
import com.example.foroom.steps.LoginSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTests {

    @get:Rule
    val activityRule = ActivityScenarioRule(ForoomActivity::class.java)

    private val loginSteps = LoginSteps()

    @Test
    fun testInvalidUsernameShowsError() {
        loginSteps.enterInvalidName()
        loginSteps.checkInvalidNameError()
    }

    @Test
    fun testInvalidPasswordShowsError() {
        loginSteps.enterInvalidPassword()
        loginSteps.checkInvalidPasswordError()
    }
}
