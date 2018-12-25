package com.kkk.mvp_koin

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import com.kkk.mvp_koin.CustomAssertions.Companion.hasItemCount
import com.kkk.mvp_koin.CustomMatchers.Companion.withItemCount
import com.kkk.mvp_koin.ui.activity.MainActivity
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @Rule
    @JvmField
    var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun checkNoticeList() {
        onView(withId(R.id.rvNotice))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
    @Test
    fun countPrograms() {
        onView(withId(R.id.rvNotice))
            .check(matches(withItemCount(10)))
    }
    @Test
    fun countProgramsWithViewAssertion() {
        onView(withId(R.id.rvNotice))
            .check(hasItemCount(10))
    }
}