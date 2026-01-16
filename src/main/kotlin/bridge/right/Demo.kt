package bridge.right

fun main() {

    val order = Order(paymentType = CardPaymentType(MastercardPaymentProvider()))
    order.checkout(50)
}