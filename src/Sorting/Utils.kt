package Sorting

/**
 * Created by aa2676 on 12 November 2017.
 */
fun <T> Array<T>.exchange(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}