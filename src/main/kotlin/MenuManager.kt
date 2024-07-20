import UserInputUtils.readUserInput

class MenuManager {
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
}
