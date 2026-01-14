package builder

object Demo {

    @JvmStatic
    fun main(args: Array<String>) {
        val component = Component.Builder()
            .setParam1()
        println(component)
    }
}