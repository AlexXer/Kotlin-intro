package com.example.ktsample

object AllHumansInApp: Group {
    private val humansArrayList = ArrayList<Human>()

    fun register(human: Human) = humansArrayList.add(human)

    override val humans: List<Human> get() = humansArrayList
}

fun assignToTask(group: Group) {

}