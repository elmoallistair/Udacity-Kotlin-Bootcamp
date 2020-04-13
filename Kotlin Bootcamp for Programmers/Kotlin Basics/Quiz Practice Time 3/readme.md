## Quiz Question

Which of these options are good reasons to explicitly make a list immutable? There may be more than 1 correct answer.
* It reduces errors in general.
* Prevents accidental changing of objects that were meant to be unchangeable.
* You cannot create mutable lists in Kotlin.
* Immutable list can hold more items than mutable list.
* In a multi-threaded environment, makes the variable thread safe, because once it has been assigned by the initial thread, no thread can change it.

### Quiz Answer
> * It reduces errors in general.
> * Prevents accidental changing of objects that were meant to be unchangeable.
> * In a multi-threaded environment, makes the variable thread safe, because once it has been assigned by the initial thread, no thread can change it.



## Practice Time

Looping over arrays and lists is a fundamental technique that has a lot of flexibility in Kotlin. Let's practice.<br>
**Basic example**
1. Create an integer array of `numbers` called numbers, from 11 to 15.
2. Create an empty mutable list for Strings.
3. Write a `for` loop that loops over the array and adds the string representation of each number to the list.

## Challenge example
* How can you use a `for` loop to create (a list of) the numbers between 0 and 100 that are divisible by 7?

### Solution Code
```
var list3 : MutableList<Int> = mutableListOf()
for (i in 0..100 step 7) list3.add(i)
print(list3)
// [0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98]
```
OR
```
for (i in 0..100 step 7) println(i.toString() + " - ")
```
