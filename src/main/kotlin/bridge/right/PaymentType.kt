package bridge.right

interface PaymentType {

    fun pay(amount: Int)
}

class CardPaymentType(private val paymentProvider: PaymentProvider) : PaymentType {

    override fun pay(amount: Int) {
        println("card payment $amount")
        paymentProvider.process()
    }
}

class GooglePayPaymentType(private val paymentProvider: PaymentProvider) : PaymentType {

    override fun pay(amount: Int) {
        println("google pay payment $amount")
        paymentProvider.process()
    }
}

class QrPaymentType(private val paymentProvider: PaymentProvider) : PaymentType {

    override fun pay(amount: Int) {
        println("qr payment $amount")
        paymentProvider.process()
    }
}
