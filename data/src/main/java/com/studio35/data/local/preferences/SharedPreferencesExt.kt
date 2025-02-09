package com.studio35.data.local.preferences

import android.content.SharedPreferences

fun SharedPreferences.execute(operation: (SharedPreferences.Editor) -> Unit) {
    with(edit()) {
        operation(this)
        apply()
    }
}
