package bridge

typealias PointsOfDamage = Long
const val RIFLE_DAMAGE: PointsOfDamage = 3L

interface Weapon {
    fun attack(x: Long, y: Long): PointsOfDamage
}

class Rifle : Weapon {
    override fun attack(x: Long, y: Long) = RIFLE_DAMAGE
}

class Flamethrower : Weapon {
    override fun attack(x: Long, y: Long)= RIFLE_DAMAGE * 2
}

class Batton : Weapon {
    override fun attack(x: Long, y: Long)= RIFLE_DAMAGE * 3
}
