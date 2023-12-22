package com.example.corelibnotificaton

class DeviceInfo {
    private val platform: DevicePlatform = getDevicePlatform()

    fun getDeviceInfo(): String {
        return platform.model +" "+ platform.brand
    }
    fun showHelloWorldToast(context: Any) {
        showToast(context, "Hello World")
    }

}

