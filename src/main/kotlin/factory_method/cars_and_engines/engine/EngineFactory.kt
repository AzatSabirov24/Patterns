package factory_method.cars_and_engines.engine

class EngineFactory {

    fun createEngine(engineType: EngineType): Engine {
        println("Initializing database connection...")
        println("Fetching engine specs...")

        return when (engineType) {
            EngineType.PETROL -> PetrolEngine()
            EngineType.ELECTRIC -> ElectricEngine()
            else -> throw IllegalArgumentException("Unknown engine type: $engineType")
        }
    }
}

enum class EngineType {
    PETROL, ELECTRIC
}