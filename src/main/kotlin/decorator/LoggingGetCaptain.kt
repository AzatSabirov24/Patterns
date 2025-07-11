package decorator

class LoggingGetCaptain(private val repository: StarTrekRepository) : StarTrekRepository by repository {

    override fun get(starshipName: String): String {
        println("Getting captain for $starshipName")
        return repository.get(starshipName)
    }
}