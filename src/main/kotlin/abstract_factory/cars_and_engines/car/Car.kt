package abstract_factory.cars_and_engines.car

import abstract_factory.cars_and_engines.engine.Engine

interface Car {

    val engine: Engine

    fun drive()
}