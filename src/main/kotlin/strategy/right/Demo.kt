package strategy.right

import strategy.right.Weapon.Banana

fun main() {

    val ourHero = OurHero()

    ourHero.shoot()
    ourHero.equip(Banana)
    ourHero.shoot()
}
