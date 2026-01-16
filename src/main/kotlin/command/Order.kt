package command

class Order() {

    fun processPayment(command: PaymentCommand) {
        command.execute()
    }
}