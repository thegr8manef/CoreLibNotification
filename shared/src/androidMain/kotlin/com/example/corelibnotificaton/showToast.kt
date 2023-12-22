package com.example.corelibnotificaton

import android.content.Context
import android.widget.Toast

actual fun showToast(context: Any, message: String) {
    val androidContext = context as? Context
    Toast.makeText(androidContext, message, Toast.LENGTH_SHORT).show()
}
