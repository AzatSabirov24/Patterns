package abstract_factory.cars_and_engines.vehicle

import abstract_factory.cars_and_engines.car.PetrolCar
import abstract_factory.cars_and_engines.engine.PetrolEngine

class PetrolVehicleFactory : VehicleFactory {

    override fun createEngine() = PetrolEngine()

    override fun createCar() = PetrolCar(createEngine())
}