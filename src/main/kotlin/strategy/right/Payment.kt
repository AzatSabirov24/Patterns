package strategy.right

sealed interface PaymentStrategy {
    fun pay(amount: Double)
}

object Cash : PaymentStrategy {

    override fun pay(amount: Double) {
        println("Оплата наличными: $amount")
    }
}

object Card : PaymentStrategy {

    override fun pay(amount: Double) {
        println("Оплата картой: $amount")
    }
}
