package chain_of_responsibility.right

fun main() {
    val order = Order(paymentCheckers = listOf(BalancePaymentChecker(), LimitPaymentChecker()))
    when (val result = order.process()) {
        CheckResult.Success -> println("OK")
        is CheckResult.Failure -> println("Error: ${result.reason}")
    }
}
