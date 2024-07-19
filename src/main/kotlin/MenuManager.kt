import java.util.Scanner

class MenuManager {
    private val scanner = Scanner(System.`in`)

    fun showMainMenu(): Int {
        println("Список архивов:")
        println("0. Создать архив")
        println("1. Просмотреть архивы")
        println("2. Выход")
        return readUserInput()
    }

    fun showArchiveMenu(): Int {
        println("Меню архива:")
        println("0. Создать заметку")
        println("1. Просмотреть заметки")
        println("2. Выход")
        return readUserInput()
    }

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
}
