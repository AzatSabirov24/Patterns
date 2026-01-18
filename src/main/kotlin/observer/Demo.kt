package observer

fun main() {
    val order = Order(paymentStrategy = QrPayment(), observer = LoggingObserver())
    order.process(60)
}