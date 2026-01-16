package strategy.wrong

import strategy.wrong.Order

fun main() {
    val order = Order(paymentType = PaymentType.CASH)
    order.process(69)
}