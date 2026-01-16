package command

fun interface PaymentCommand {

    fun execute()
}

class PayCommand(private val amount: Int) : PaymentCommand {

    override fun execute() {
        println("payment $amount")
    }
}

class CancelCommand(private val reason: String) : PaymentCommand {

    override fun execute() {
        println("cancel -> $reason")
    }
}
