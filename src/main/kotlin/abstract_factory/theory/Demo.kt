package abstract_factory.theory

import abstract_factory.theory.appliction.Application
import abstract_factory.theory.gui_factory.GuiFactory
import abstract_factory.theory.gui_factory.MacGuiFactory
import abstract_factory.theory.gui_factory.WindowsGuiFactory
import java.util.*

object Demo {
    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически, исходя
     * из конфигурации или окружения.
     */
    private fun configureApplication(): Application {
        val osName = System.getProperty("os.name").lowercase(Locale.getDefault())
        val factory = if (osName.contains("mac")) {
            MacGuiFactory()
        } else {
            WindowsGuiFactory()
        }
        return Application(factory)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val app = configureApplication()
        app.paint()
    }
}