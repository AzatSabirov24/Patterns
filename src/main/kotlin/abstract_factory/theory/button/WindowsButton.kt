package abstract_factory.theory.button

class WindowsButton : Button {

    override fun create() {
        println("You created Windows Button")
    }

    override fun paint() {
        println("You painted Windows Button")
    }
}