package observer

interface PaymentObserver {

    fun onResult(result: PaymentResult)
}

class LoggingObserver : PaymentObserver {

    override fun onResult(result: PaymentResult) {
        when (result) {
            PaymentResult.Failure -> {
                println("failure")
            }

            PaymentResult.Success -> {
                println("success")
            }
        }
    }
}
