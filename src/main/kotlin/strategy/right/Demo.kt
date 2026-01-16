package strategy.right

fun main() {

    val order = Order()
    order.checkout(paymentStrategy = CardPayment, amount = 50)
}