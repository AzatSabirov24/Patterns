package bridge

typealias SoundLevel = Int

const val RegularSound: SoundLevel = 1

interface Shout {

    fun shout(): SoundLevel
}

class RegularShout : Shout {

    override fun shout() = RegularSound
}

class PowerShout : Shout {

    override fun shout() = RegularSound * 3
}
