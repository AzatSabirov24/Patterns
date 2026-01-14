package bridge

typealias Meters = Int
const val REGULAR_SPEED: Meters = 1

interface Legs {
    fun move(x: Long, y: Long): Meters
}

class RegularLegs : Legs {
    override fun move(x: Long, y: Long) = REGULAR_SPEED
}
class AthleticLegs : Legs {
    override fun move(x: Long, y: Long) = REGULAR_SPEED * 2
}
