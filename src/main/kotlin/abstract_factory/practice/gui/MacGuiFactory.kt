package abstract_factory.practice.gui

import abstract_factory.practice.button.Button
import abstract_factory.practice.button.MacButton
import abstract_factory.practice.check_box.CheckBox
import abstract_factory.practice.check_box.MacCheckBox

class MacGuiFactory : GuiFactory {

    override fun createButton() = MacButton()

    override fun createCheckBox() = MacCheckBox()
}