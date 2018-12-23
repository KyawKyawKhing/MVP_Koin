package com.kkk.mvp_koin

import org.junit.Rule
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.rule.ActivityTestRule
import com.kkk.mvp_koin.ui.activity.MainActivity
import org.junit.Test


class HomeActivityTest{

    @Rule
    @JvmField
    var activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun loadDataAndShow() {
//        val name = "mvp"
//        val password = "mvp"
//
//        onView(withId(R.id.et_login_username)).perform(typeText("username is mvp"), closeSoftKeyboard())
//        onView(withId(R.id.et_login_password)).perform(
//            typeText("password is mvp"),
//            closeSoftKeyboard()
//        )
//
//        onView(withId(R.id.btn_login_clear)).perform(click())
//
//        onView(withId(R.id.et_login_username)).perform(typeText(name), closeSoftKeyboard())
//        onView(withId(R.id.et_login_password)).perform(
//            typeText(password),
//            closeSoftKeyboard()
//        )
//
//
//        onView(withId(R.id.btn_login_login)).perform(click())


    }
}