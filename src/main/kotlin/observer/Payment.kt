package observer

interface PaymentStrategy {

    fun pay(amount: Int): PaymentResult
}

class CardPayment : PaymentStrategy {

    override fun pay(amount: Int): PaymentResult {
        println("payment by card: $amount")
        return PaymentResult.Failure
    }
}

class QrPayment : PaymentStrategy {

    override fun pay(amount: Int): PaymentResult {
        println("payment by qr: $amount")
        return PaymentResult.Success
    }
}
