package bridge.wrong

fun main() {

    val order = Order(
        paymentService = PaymentService(provider = Provider.VISA, paymentType = PaymentType.CARD),
    )
    order.pay(50)
}