package abstract_factory.practice.check_box

class MacCheckBox : CheckBox {

    override fun create() {
        println("You created Mac CheckBox")
    }

    override fun paint() {
        println("You painted Mac CheckBox")
    }
}