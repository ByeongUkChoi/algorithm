class MyStack() {
    private val list = ArrayList<Int>()

    fun push(x: Int) {
        list.add(x)
    }

    fun pop(): Int = list.removeLast()
    fun top(): Int = list.last()
    fun empty(): Boolean = list.isEmpty()
}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */