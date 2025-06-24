package abstract_factory.practice

import abstract_factory.practice.application.Application
import abstract_factory.practice.gui.MacGuiFactory
import abstract_factory.practice.gui.WindowsGuiFactory
import java.util.*

object Demo {

    @JvmStatic
    fun main(args: Array<String>) {
        val application = configureApplication()
        application.createButton()
        application.paintButton()
        application.createCheckBox()
        application.paintCheckBox()
    }

    private fun configureApplication(): Application {
        val osName = System.getProperty("os.name").lowercase(Locale.getDefault())
        val guiFactory = if (osName.contains("mac")) MacGuiFactory() else WindowsGuiFactory()
        return Application(guiFactory)
    }
}