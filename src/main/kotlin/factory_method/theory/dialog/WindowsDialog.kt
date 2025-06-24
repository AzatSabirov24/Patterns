package factory_method.theory.dialog

import factory_method.theory.button.Button
import factory_method.theory.button.WindowsButton


/**
 * Диалог на элементах операционной системы.
 */
class WindowsDialog : Dialog {

    override fun createButton(): Button {
        return WindowsButton()
    }
}