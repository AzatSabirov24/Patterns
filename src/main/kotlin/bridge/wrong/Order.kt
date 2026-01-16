package bridge.wrong

class Order(private val paymentService: PaymentService) {

    fun pay(amount: Int) {

        paymentService.pay(amount)
    }
}