package bridge

data class ShoutTrooper(
    private val weapon: Weapon,
    private val legs: Legs,
    private val shout: Shout,
) : Trooper {

    override fun move(x: Long, y: Long) {
        legs.move(x, y)
    }

    override fun attackRebel(x: Long, y: Long) {
        weapon.attack(x, y)
    }
}