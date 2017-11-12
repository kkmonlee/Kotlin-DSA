package Sorting

/**
 * Created by aa2676 on 12 November 2017.
 */
abstract class AbstractSorter {
    abstract fun<T : Comparable<T>> perform(arr: Array<T>)
}