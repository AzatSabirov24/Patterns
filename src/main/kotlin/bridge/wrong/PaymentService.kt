package bridge.wrong

enum class PaymentType {
    CARD,
    GOOGLE_PAY
}

enum class Provider {
    VISA,
    MASTERCARD
}

class PaymentService(private val provider: Provider, private val paymentType: PaymentType) {

    fun pay(
        amount: Int
    ) {
        when (paymentType) {
            PaymentType.CARD -> {
                when (provider) {
                    Provider.VISA ->
                        println("Pay $amount using Card + Visa")
                    Provider.MASTERCARD ->
                        println("Pay $amount using Card + Mastercard")
                }
            }

            PaymentType.GOOGLE_PAY -> {
                when (provider) {
                    Provider.VISA ->
                        println("Pay $amount using GooglePay + Visa")
                    Provider.MASTERCARD ->
                        println("Pay $amount using GooglePay + Mastercard")
                }
            }
        }
    }
}
