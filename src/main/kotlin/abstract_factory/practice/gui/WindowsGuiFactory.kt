package abstract_factory.practice.gui

import abstract_factory.practice.button.Button
import abstract_factory.practice.button.WindowsButton
import abstract_factory.practice.check_box.CheckBox
import abstract_factory.practice.check_box.WindowsCheckBox

class WindowsGuiFactory : GuiFactory {

    override fun createButton() = WindowsButton()

    override fun createCheckBox() = WindowsCheckBox()
}