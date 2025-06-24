package factory_method.cars_and_engines

import factory_method.cars_and_engines.car.Car
import factory_method.cars_and_engines.engine.EngineFactory
import factory_method.cars_and_engines.engine.EngineType

fun main() {
    val engineFactory = EngineFactory()
    val engine = engineFactory.createEngine(EngineType.ELECTRIC)

    val car = Car(engine)
    car.run()
}