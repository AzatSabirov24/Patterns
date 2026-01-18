package observer

class Order(
    private val paymentStrategy: PaymentStrategy,
    private val observer: PaymentObserver,
) {

    fun process(amount: Int) {
        val paymentResult = paymentStrategy.pay(amount)
        observer.onResult(paymentResult)
    }
}