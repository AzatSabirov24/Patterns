package decorator

object Demo {

    @JvmStatic
    fun main(args: Array<String>) {
        val defaultStarTrackRepository = DefaultStarTrekRepository()

        val withValidating = ValidatingAdd(defaultStarTrackRepository)

        val withLoggingAndValidating =
            LoggingGetCaptain(withValidating)

        println(withLoggingAndValidating)

        withLoggingAndValidating["USS Enterprise"]
        withLoggingAndValidating["USS Voyager"] = "Kathryn Janeway"
    }
}