package DataStructures

/**
 * Created by aa2676 on 12 November 2017.
 */
class Stack<T> : Collection<T> {
    private var head: Node<T>? = null
    override var size: Int = 0
        private set

    fun push(item: T) {
        val new = Node(item)
        new.next = head
        head = new
        size++
    }

    fun peek(): T {
        if (size == 0) throw NoSuchElementException()
        return head!!.value
    }

    fun pop(): T {
        if (size == 0) throw NoSuchElementException()
        val old = head!!
        head = old.next
        return old.value
    }

    private class Node<T>(var value: T) {
        var next: Node<T>? = null
    }

    override fun iterator(): Iterator<T> {
        return object : Iterator<T> {
            var node = head

            override fun hasNext(): Boolean {
                return node != null
            }

            override fun next(): T {
                if (!hasNext()) throw NoSuchElementException()
                val current = node!!
                node = current.next
                return current.value
            }
        }
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun contains(element: T): Boolean {
        for (obj in this) {
            if (obj == element) return true
        }
        return false
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        for (element in elements) {
            if (!contains(element)) return false
        }
        return true
    }
}