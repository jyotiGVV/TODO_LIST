data class task1(val id: Int, var description: String, var isDone:Boolean=false){

}

fun addTask(tasks:MutableList<task1>, nextid:Int) {
    print("Enter your task description : ")
    val taskDescription = readln()?:""
    tasks.add(task1(nextid,taskDescription))
    print("Task is added ")
}


fun viweTask(tasks: MutableList<task1>) = if(tasks.isEmpty()) {
    println("No task is available")
}else{
    tasks.forEach{task->
        val status= if(task.isDone) "Done" else "NotDone"
        println("${task.id}. $status ${task.description}")

    }
}

fun markTaskDone(tasks: MutableList<task1>){
    viweTask(tasks)
    print("Enter mark Id to mark is done")
    val taskId= readln()?.toIntOrNull()
    val T1=tasks.find { it.id==taskId }

    if (T1!=null){
        T1.isDone=true
        println("Task marks as Done")
    }
    else{
        println("Invalid Task Id")
    }
}

fun deleteTask(tasks: MutableList<task1>){
    viweTask(tasks)
    val taskId= readln()?.toIntOrNull()
    val T1=tasks.find { it.id==taskId }

    if (T1!=null){
        tasks.remove(T1)
        println(" The task is deleted")
    }else{
        println("Invalid task id")
    }

}
