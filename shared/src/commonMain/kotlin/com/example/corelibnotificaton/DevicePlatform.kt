package com.example.corelibnotificaton

interface DevicePlatform {
    val model: String
    val brand: String
}

expect fun getDevicePlatform(): DevicePlatform