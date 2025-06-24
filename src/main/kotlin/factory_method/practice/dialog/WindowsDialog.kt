package factory_method.practice.dialog

import factory_method.practice.button.Button
import factory_method.practice.button.WindowsButton

class WindowsDialog : Dialog {

    override fun createButton() = WindowsButton()
}