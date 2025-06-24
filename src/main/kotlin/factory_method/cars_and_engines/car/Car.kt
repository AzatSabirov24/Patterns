package factory_method.cars_and_engines.car

import factory_method.cars_and_engines.engine.Engine

class Car(private val engine: Engine) {

    fun run() {
        engine.start()
    }
}