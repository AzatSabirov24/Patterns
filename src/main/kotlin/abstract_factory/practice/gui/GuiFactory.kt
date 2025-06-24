package abstract_factory.practice.gui

import abstract_factory.practice.button.Button
import abstract_factory.practice.check_box.CheckBox

interface GuiFactory {

    fun createButton(): Button

    fun createCheckBox(): CheckBox
}