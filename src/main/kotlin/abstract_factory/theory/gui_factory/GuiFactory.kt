package abstract_factory.theory.gui_factory

import abstract_factory.theory.button.Button
import abstract_factory.theory.check_box.CheckBox

interface GuiFactory {

    fun createButton(): Button

    fun createCheckBox(): CheckBox
}