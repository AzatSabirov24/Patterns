package factory_method.practice.button

class WindowsButton : Button {

    override fun onClick() {
        println("clink on windows button")
    }

    override fun render() {
        onClick()
        println("windows button")
    }
}