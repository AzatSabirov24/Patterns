package chain_of_responsibility.right

class Order(
    private val paymentCheckers: List<PaymentChecker>
) {

    fun process(): CheckResult {
        for (checker in paymentCheckers) {
            val result = checker.check()
            if (result is CheckResult.Failure) {
                println(result.reason)
                return result
            }
        }
        return CheckResult.Success
    }
}

