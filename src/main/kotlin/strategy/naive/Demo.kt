package strategy.naive

import strategy.naive.weapon.Banana
import strategy.naive.weapon.Peashooter
import strategy.naive.weapon.Weapon

fun main() {
    var currentWeapon: Weapon = Peashooter()

    fun shoot(): Projectile = currentWeapon.shoot(5, 5, Direction.LEFT)

    fun equip(weapon: Weapon) {
        currentWeapon = weapon
    }

    shoot()
    equip(Banana())
    shoot()
}
