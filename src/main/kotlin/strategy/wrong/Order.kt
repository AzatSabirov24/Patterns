package strategy.wrong

class Order(private val paymentType: PaymentType) {

    fun process(amount: Int) {
        when(paymentType) {
            PaymentType.CARD -> println("card payment $amount")
            PaymentType.CASH -> println("cash payment $amount")
        }
    }
}

enum class PaymentType {

    CARD, CASH
}