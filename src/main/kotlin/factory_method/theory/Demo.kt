package factory_method.theory

import factory_method.theory.dialog.Dialog
import factory_method.theory.dialog.HtmlDialog
import factory_method.theory.dialog.WindowsDialog


/**
 * Демо-класс. Здесь всё сводится воедино.
 */
object Demo {

    private var dialog: Dialog? = null

    @JvmStatic
    fun main(args: Array<String>) {
        configure()
        runBusinessLogic()
    }

    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации или
     * окружения.
     */
    private fun configure() {
        dialog = if (System.getProperty("os.name") == "Windows 10") {
            WindowsDialog()
        } else {
            HtmlDialog()
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    private fun runBusinessLogic() {
        dialog?.renderWindow()
    }
}