data class Task(val id:Int,var description:String, var isDone:Boolean=false)


    fun addTask(tasks: MutableList<Task>, nextid: Int) {
        print("Enter your task description : ")
        val taskDescription = readln() ?: ""
        tasks.add(Task(nextid, taskDescription))
        println("Task is added ")
        viweTask(tasks)
    }


    fun viweTask(tasks: MutableList<Task>) = if (tasks.isEmpty()) {
        println("No task is available")
    } else {
        tasks.forEach { task ->
            val status = if (task.isDone) ("Done") else ("NotDone")
            println("${task.id}. $status ${task.description}")
        }
    }

    fun markTaskDone(tasks: MutableList<Task>) {
        viweTask(tasks)
        if (tasks.isEmpty()) {
            println("No task is available to mark as done")
            return
        }
        print("Enter mark Id to mark is done")

        val taskId = readln().toIntOrNull()
        val T1 = tasks.find { it.id == taskId }

        if (T1 != null) {
            T1.isDone = true
            println("Task marks as Done")
        } else {
            println("Invalid Task Id")
        }
    }

    fun deleteTask(tasks: MutableList<Task>) {
        viweTask(tasks)
        val taskId = readln().toIntOrNull()
        val T1 = tasks.find { it.id == taskId }

        if (T1 != null) {
            tasks.remove(T1)
            println(" The task is deleted")
        } else {
            println("Invalid task id")
        }

    }
