package observer

sealed interface PaymentResult {

    object Success : PaymentResult

    object Failure : PaymentResult
}
