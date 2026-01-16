package strategy.right

fun main() {

    val order = Order.create(paymentStrategy = Cash)

    order.checkout(10.0)

    val order2 = Order.create(paymentStrategy = Card)
    order2.checkout(20.0)
}