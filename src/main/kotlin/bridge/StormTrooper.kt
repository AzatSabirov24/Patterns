package bridge

data class StormTrooper(
    private val weapon: Weapon,
    private val legs: Legs
) : Trooper {

    override fun move(x: Long, y: Long) {
        legs.move(x, y)
    }

    override fun attackRebel(x: Long, y: Long) {
        weapon.attack(x, y)
    }
}
