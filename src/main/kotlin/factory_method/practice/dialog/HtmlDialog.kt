package factory_method.practice.dialog

import factory_method.practice.button.Button
import factory_method.practice.button.HtmlButton

class HtmlDialog : Dialog {

    override fun createButton() = HtmlButton()
}