package builder.theory

object Demo {

    @JvmStatic
    fun main(args: Array<String>) {
        val component = Component.Builder()
            .setParam1()
        println(component)
    }
}