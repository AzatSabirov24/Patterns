package abstract_factory.theory.check_box

class WindowsCheckBox : CheckBox{

    override fun create() {
        println("You created Windows CheckBox")
    }

    override fun paint() {
        println("You painted Windows CheckBox")
    }
}