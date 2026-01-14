package bridge

fun main() {
    val stormTrooper = StormTrooper(Rifle(), RegularLegs())
    val flameTrooper = StormTrooper(Flamethrower(), RegularLegs())
    val scoutTrooper = StormTrooper(Rifle(), AthleticLegs())
    val shoutTrooper = ShoutTrooper(Rifle(), AthleticLegs(), RegularShout())

    println(listOf(stormTrooper, flameTrooper, scoutTrooper))
}
