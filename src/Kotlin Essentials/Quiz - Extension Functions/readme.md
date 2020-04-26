# Practice Time
It can be useful to know the weight of a book, for example, for shipping. The weight of a book can change because sometimes pages get torn, and the page count changes. While calculating the weight could be defined as a method, it’s more like a helper function. Besides, it would hurt a book's feelings to have a method that tears up its pages.

1. Add a mutable property `pages` to `Book`.
2. Create an extension function on `Book` that returns the weight of a book as the page count multiplied by 1.5 grams.
3. Create another extension, `tornPages()`, that takes the number of torn pages as an argument and changes the page count of the book.
4. Write a class `Puppy` with a method `playWithBook()` that takes a book as an argument, and removes a random number of pages from the book.
5. Create a `puppy` and give it a `book` to play with, until there are no more pages.

**Note**: If you don’t want to give your `puppy` a `book`, then create a `puzzle toy` class and fill it with `treats`.

## Solution Code
```
fun Book.weight() : Double { return (pages * 1.5) }
```
```
fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0
```
```
class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}
```
```
val puppy = Puppy()
val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

while (book.pages > 0) {
    puppy.playWithBook(book)
    println("${book.pages} left in ${book.title}")
}
println("Sad puppy, no more pages in ${book.title}. ")
``````