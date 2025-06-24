package abstract_factory.cars_and_engines

import abstract_factory.cars_and_engines.vehicle.ElectricVehicleFactory
import abstract_factory.cars_and_engines.vehicle.PetrolVehicleFactory

fun main() {
    val petrolVehicleFactory = PetrolVehicleFactory()
    val petrolCar = petrolVehicleFactory.createCar()
    petrolCar.drive()

    val electricVehicleFactory = ElectricVehicleFactory()
    val electricCar = electricVehicleFactory.createCar()
    electricCar.drive()
}