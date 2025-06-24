package factory_method.practice.button

class HtmlButton : Button {

    override fun onClick() {
        println("clink on html button")
    }

    override fun render() {
        onClick()
        println("html button")
    }
}