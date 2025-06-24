package abstract_factory.cars_and_engines.vehicle

import abstract_factory.cars_and_engines.car.Car
import abstract_factory.cars_and_engines.engine.Engine

interface VehicleFactory {

    fun createEngine(): Engine

    fun createCar(): Car
}