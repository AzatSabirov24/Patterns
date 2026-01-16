package bridge.right

class Order(private val paymentType: PaymentType) {

    fun checkout(amount: Int) {
        paymentType.pay(amount)
    }
}
