package chain_of_responsibility.wrong

sealed interface CheckResult {
    object Success : CheckResult
    data class Failure(val reason: String) : CheckResult
}

class Order {

    fun process(): CheckResult {

        if (!checkBalance()) {
            println("reason : balance")
            return CheckResult.Failure("balance")
        }

        if (!checkLimit()) {
            println("reason : Limit")
            return CheckResult.Failure("limit")
        }

        return CheckResult.Success
    }

    private fun checkBalance(): Boolean {
        return true
    }

    private fun checkLimit(): Boolean {
        return false
    }
}
