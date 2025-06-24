package factory_method.practice.dialog

import factory_method.practice.button.Button

interface Dialog {

    fun createDialog() {
        val button = createButton()
        button.render()
    }

    fun createButton(): Button
}