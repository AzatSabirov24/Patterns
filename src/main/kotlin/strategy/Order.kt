package strategy

class Order {

    fun checkout(paymentStrategy: PaymentStrategy, amount: Int) {
        paymentStrategy.pay(amount)
    }
}