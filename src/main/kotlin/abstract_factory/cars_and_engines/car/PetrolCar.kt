package abstract_factory.cars_and_engines.car

import abstract_factory.cars_and_engines.engine.Engine

class PetrolCar(override val engine: Engine) : Car {

    override fun drive() {
        engine.start()
        println("drive Petrol Car")
    }
}