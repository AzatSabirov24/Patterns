package command

fun main() {

    val order = Order()
    order.processPayment(PayCommand(amount = 50))
    order.processPayment(CancelCommand("no money"))
}