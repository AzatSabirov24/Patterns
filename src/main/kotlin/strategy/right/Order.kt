package strategy.right

class Order private constructor(
    private val paymentStrategy: PaymentStrategy,
) {

    fun checkout(amount: Double) {
        paymentStrategy.pay(amount)
    }

    companion object {

        fun create(paymentStrategy: PaymentStrategy): Order {

            return Order(paymentStrategy)
        }
    }
}
