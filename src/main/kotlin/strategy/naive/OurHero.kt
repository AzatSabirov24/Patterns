package strategy.naive

class OurHero {

    private var direction = Direction.LEFT
    private var x: Int = 42
    private var y: Int = 173

    fun shoot(): Projectile {
        return Projectile(x, y, direction)
    }
}
