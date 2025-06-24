package strategy.naive.weapon

import strategy.naive.Direction
import strategy.naive.Projectile

class Banana : Weapon {

    override fun shoot(
        x: Int,
        y: Int,
        direction: Direction
    ): Projectile {
        println("using Banana")
        return Projectile(x, y, direction)
    }
}
