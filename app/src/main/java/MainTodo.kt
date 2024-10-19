
fun main(){

    val toDo = ToDo()
    toDo.getToDo()
}

class ToDo{

    fun getToDo() {
        val t1 = mutableListOf<Task>()
        var nextid = 1
        while (true) {
            println("\nToDo list ")
            println("1. Add Task")
            println("2. View Task")
            println("3. Marks task is Done")
            println("4. Delete Task")
            println("Exist")

            print("\nChoose an option :")
            when (readln().toIntOrNull()) {
                1 -> addTask(t1, nextid).also { nextid++ }
                2 -> viweTask(t1)
                3 -> markTaskDone(t1)
                4 -> deleteTask(t1)
                5 -> {
                    println("Existing")
                    break
                }

                else -> println("Invalid option! please Try Again")

            }


        }
    }

}