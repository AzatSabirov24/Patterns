package strategy.right

class Order {

    fun checkout(paymentStrategy: PaymentStrategy, amount: Int) {
        paymentStrategy.pay(amount)
    }
}