import java.util.Scanner

object UserInputUtils {
    private val scanner = Scanner(System.`in`)

    fun readUserInput(): Int {
        while (true) {
            val input = scanner.nextLine()
            if (input.matches(Regex("\\d+"))) {
                return input.toInt()
            } else {
                println("Неверный ввод. Пожалуйста, введите число.")
            }
        }
    }

    fun readNonEmptyLine(): String {
        while (true) {
            val input = scanner.nextLine()
            if (input.isNotBlank()) {
                return input
            } else {
                println("Поле не должно быть пустым. Пожалуйста, введите значение:")
            }
        }
    }
}
