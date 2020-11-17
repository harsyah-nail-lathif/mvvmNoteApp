package com.example.notes.util

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager

fun hideKeyboard(activity:Activity){
    val inputMethodManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

    val curentFocusedView = activity.currentFocus
    curentFocusedView.let {
        inputMethodManager.hideSoftInputFromWindow(
            curentFocusedView?.windowToken, InputMethodManager.HIDE_NOT_ALWAYS
        )
    }
}