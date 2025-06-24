package abstract_factory.cars_and_engines.vehicle

import abstract_factory.cars_and_engines.car.ElectricCar
import abstract_factory.cars_and_engines.engine.ElectricEngine

class ElectricVehicleFactory : VehicleFactory {

    override fun createEngine() = ElectricEngine()

    override fun createCar() = ElectricCar(createEngine())
}