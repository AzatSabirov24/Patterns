package strategy.right

fun interface PaymentStrategy {

    fun pay(amount: Int)
}

val CardPayment = PaymentStrategy { amount ->
    println("payment by card $amount")
}

class CashPayment : PaymentStrategy {

    override fun pay(amount: Int) {
        println("payment by cash $amount")
    }
}

class QrPayment : PaymentStrategy {

    override fun pay(amount: Int) {
        println("payment by qr $amount")
    }
}