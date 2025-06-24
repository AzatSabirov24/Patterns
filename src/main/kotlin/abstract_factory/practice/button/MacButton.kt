package abstract_factory.practice.button

class MacButton : Button {

    override fun create() {
        println("You created Mac Button")
    }

    override fun paint() {
        println("You painted Mac Button")
    }
}