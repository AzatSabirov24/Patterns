package factory_method.theory.dialog

import factory_method.theory.button.Button
import factory_method.theory.button.HtmlButton


/**
 * HTML-диалог.
 */
class HtmlDialog : Dialog {

    override fun createButton(): Button {
        return HtmlButton()
    }
}