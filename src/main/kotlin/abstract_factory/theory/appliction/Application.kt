package abstract_factory.theory.appliction

import abstract_factory.theory.button.Button
import abstract_factory.theory.check_box.CheckBox
import abstract_factory.theory.gui_factory.GuiFactory

class Application(factory: GuiFactory) {

    private val button = factory.createButton()
    private val checkbox = factory.createCheckBox()

    fun paint() {
        button.paint()
        checkbox.paint()
    }
}