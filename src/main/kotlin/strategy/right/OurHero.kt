package strategy.right

import strategy.naive.Direction

sealed class Weapon {
    object Peashooter : Weapon()
    object Banana : Weapon()
}

class OurHero {

    private var direction = Direction.LEFT
    private var x: Int = 42
    private var y: Int = 173
    private var equipped: Weapon = Weapon.Peashooter

    fun shoot() {
        when (equipped) {
            is Weapon.Peashooter -> Weapons.peashooter(x, y, direction)
            is Weapon.Banana -> Weapons.banana(x, y, direction)
        }
    }

    fun equip(weapon: Weapon) {
        equipped = weapon
    }
}
