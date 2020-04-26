# Practice Time
Let's go through an example of getting information about a book in the format of a Pair. Generally, you want information about both the title and the author, and perhaps also the year.
1. Let’s create a basic book class, with a title, author, and year. Of course, you could get each of the properties separately.
2. Create a method that returns both the title and the author as a `Pair`.
3. Create a method that returns the title, author and year as a Triple. Use the [documentation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html) to find out how to use `Triple`.
4. Create a `book` instance.
5. Print out the information about the book in a sentence, such as: “Here is your book X written by Y in Z.”

## Solution Code
```
class Book(val title: String, val author: String, val year: Int) {
    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}
```
```
fun main(args: Array<String>) {
    val book = Book("Romeon and Juliet", "William Shakespeare", 1597)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

}
```