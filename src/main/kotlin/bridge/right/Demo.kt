package bridge.right

fun main() {

    val order = Order(paymentType = QrPaymentType(MastercardPaymentProvider()))
    order.checkout(50)
}