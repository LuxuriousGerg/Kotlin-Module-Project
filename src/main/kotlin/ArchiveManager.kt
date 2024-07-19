class ArchiveManager(private val menuManager: MenuManager) {
    private val archives = mutableListOf<Archive>()

    fun createArchive() {
        println("Введите название архива:")
        val name = readNonEmptyLine()
        archives.add(Archive(name))
        println("Архив '$name' создан.")
    }

    fun showArchives() {
        if (archives.isEmpty()) {
            println("Нет доступных архивов.")
            return
        }

        println("Выберите архив:")
        for ((index, archive) in archives.withIndex()) {
            println("$index. ${archive.name}")
        }
        println("${archives.size}. Назад")

        val choice = menuManager.readUserInput()
        if (choice in 0 until archives.size) {
            val archive = archives[choice]
            handleArchive(archive)
        }
    }

    private fun handleArchive(archive: Archive) {
        while (true) {
            when (menuManager.showArchiveMenu()) {
                0 -> archive.createNote()
                1 -> archive.showNotes()
                2 -> return
                else -> println("Некорректный ввод. Пожалуйста, введите число от 0 до 2.")
            }
        }
    }
    private fun readNonEmptyLine(): String {
        while (true) {
            val input = readLine() ?: ""
            if (input.isNotBlank()) {
                return input
            } else {
                println("Поле не должно быть пустым. Пожалуйста, введите значение:")
            }
        }
    }
}
