package factory_method.practice

import factory_method.practice.dialog.Dialog
import factory_method.practice.button.Button
import factory_method.practice.dialog.HtmlDialog
import factory_method.practice.dialog.WindowsDialog

object Demo {

    private var dialog: Dialog? = null

    @JvmStatic
    fun main(args: Array<String>) {
        renderDialog()
        businessLogic()
    }


    private fun renderDialog() {
        dialog = if (System.getProperty("os.name") == "Windows") {
            WindowsDialog()
        } else {
            HtmlDialog()
        }
    }

    private fun businessLogic() {
        dialog?.createDialog()
    }
}