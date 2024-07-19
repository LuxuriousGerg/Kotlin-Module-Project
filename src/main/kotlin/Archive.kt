class Archive(val name: String) {
    private val notes = mutableListOf<Note>()

    fun createNote() {
        println("Введите заголовок заметки:")
        val title = readNonEmptyLine()
        println("Введите текст заметки:")
        val content = readNonEmptyLine()
        notes.add(Note(title, content))
        println("Заметка '$title' создана.")
    }

    fun showNotes() {
        if (notes.isEmpty()) {
            println("Нет доступных заметок.")
            return
        }

        println("Выберите заметку:")
        for ((index, note) in notes.withIndex()) {
            println("$index. ${note.title}")
        }
        println("${notes.size}. Назад")

        val choice = readUserInput()
        if (choice in 0 until notes.size) {
            val note = notes[choice]
            println("Заголовок: ${note.title}")
            println("Текст: ${note.content}")
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

    private fun readUserInput(): Int {
        while (true) {
            val input = readLine() ?: ""
            if (input.matches(Regex("\\d+"))) {
                return input.toInt()
            } else {
                println("Неверный ввод. Пожалуйста, введите число.")
            }
        }
    }
}
