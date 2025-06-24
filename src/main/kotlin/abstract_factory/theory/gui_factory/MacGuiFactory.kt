package abstract_factory.theory.gui_factory

import abstract_factory.theory.button.Button
import abstract_factory.theory.button.MacButton
import abstract_factory.theory.check_box.CheckBox
import abstract_factory.theory.check_box.MacCheckBox

class MacGuiFactory : GuiFactory {

    override fun createButton() = MacButton()

    override fun createCheckBox() = MacCheckBox()
}