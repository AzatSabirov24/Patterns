package strategy.naive.weapon

import strategy.naive.Direction
import strategy.naive.Projectile

interface Weapon {

    fun shoot(
        x: Int,
        y: Int,
        direction: Direction
    ): Projectile
}
