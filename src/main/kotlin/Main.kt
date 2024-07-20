fun main() {
    val menuManager = MenuManager()
    val archiveManager = ArchiveManager(menuManager)

    while (true) {
        when (menuManager.showMainMenu()) {
            0 -> archiveManager.createArchive()
            1 -> archiveManager.showArchives()
            2 -> break
            else -> println("Некорректный ввод. Пожалуйста, введите число от 0 до 2.")
        }
    }
}