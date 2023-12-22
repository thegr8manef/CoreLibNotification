package com.example.corelibnotificaton

import com.example.corelibnotificaton.DevicePlatform.UIKit.UIDevice

class IOSPlatform: DevicePlatform {
    override val model: String = UIDevice.currentDevice.model
    override val brand: String = UIDevice.currentDevice.userInterfaceIdiom
}

