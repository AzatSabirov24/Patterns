package strategy.right

import strategy.naive.Direction
import strategy.naive.Projectile

object Weapons {

    fun peashooter(x: Int, y: Int, direction: Direction): Projectile {
        println("using Peashooter")
        return Projectile(x, y, direction)
    }

    fun banana(x: Int, y: Int, direction: Direction): Projectile {
        println("using Banana")
        return Projectile(x, y, direction)
    }
}
