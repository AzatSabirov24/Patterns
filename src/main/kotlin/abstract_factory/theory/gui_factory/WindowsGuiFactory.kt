package abstract_factory.theory.gui_factory

import abstract_factory.theory.button.Button
import abstract_factory.theory.button.MacButton
import abstract_factory.theory.button.WindowsButton
import abstract_factory.theory.check_box.CheckBox
import abstract_factory.theory.check_box.MacCheckBox
import abstract_factory.theory.check_box.WindowsCheckBox

class WindowsGuiFactory : GuiFactory {

    override fun createButton() = WindowsButton()

    override fun createCheckBox() = WindowsCheckBox()
}