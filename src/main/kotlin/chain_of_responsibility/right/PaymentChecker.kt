package chain_of_responsibility.right

sealed interface CheckResult {
    object Success : CheckResult
    data class Failure(val reason: String) : CheckResult
}

interface PaymentChecker {

    fun check(): CheckResult
}

class BalancePaymentChecker : PaymentChecker {

    override fun check(): CheckResult {
        return CheckResult.Success
    }
}

class LimitPaymentChecker : PaymentChecker {

    override fun check(): CheckResult {
        return CheckResult.Failure("limit")
    }
}
