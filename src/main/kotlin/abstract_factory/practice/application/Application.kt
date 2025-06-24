package abstract_factory.practice.application

import abstract_factory.practice.gui.GuiFactory

class Application(guiFactory: GuiFactory) {

    private val button = guiFactory.createButton()
    private val checkBox = guiFactory.createCheckBox()

    fun createButton() = button.create()

    fun paintButton() = button.paint()

    fun createCheckBox() = checkBox.create()

    fun paintCheckBox() = checkBox.paint()
}