package bridge.right

interface PaymentProvider {

    fun process()
}

class VisaPaymentProvider : PaymentProvider {

    override fun process() {
        println("payment by visa")
    }
}

class MastercardPaymentProvider : PaymentProvider {

    override fun process() {
        println("payment by Mastercard")
    }
}
