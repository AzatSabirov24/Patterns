package strategy.naive.weapon

import strategy.naive.Direction
import strategy.naive.Projectile

class Peashooter : Weapon {

    override fun shoot(
        x: Int,
        y: Int,
        direction: Direction
    ) : Projectile {
        println("using Peashooter")
        return Projectile(x, y, direction)
    }
}
