package com.example.corelibnotificaton

import platform.UIKit.UIViewController
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertAction

actual fun showToast(context: Any, message: String) {
    val viewController = context as? UIViewController
    val alertController = UIAlertController.alertControllerWithTitle(
        title = null,
        message = message,
        preferredStyle = UIAlertControllerStyleUIAlertControllerStyleAlert
    )

    val okAction = UIAlertAction.actionWithTitle("OK", style = UIAlertActionStyleUIAlertActionStyleDefault, handler = null)
    alertController.addAction(okAction)

    viewController?.presentViewController(alertController, animated = true, completion = null)
}
