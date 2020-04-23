# Practice Functions
In this practice, you will create your own Kotlin file with a main function and another function. You will use this file in later practices as a scratch file for your code, like we do in the screencasts.

> ## Basic Task
> 1. Create a new Kotlin file.
> 2. Copy and paste the `main()` function from Hello World into the file.
> 3. Create a new function, `dayOfWeek()`.
> 4. In the body of the function, print "What day is it today?"
> 5. Call `dayOfWeek()` from `main()`.
> 6. Run your program.
>
> ### Solution Code
> ```
> fun main(args: Array<String>) {
>     dayOfWeek()
> }
>    
> fun dayOfWeek() {
>     println("What day is it today?")
> }
> ```

> ## Extended Task
> In the body of the `dayOfWeek()` function, answer the question by printing the current day of the week.
> 
> **Hints**
> * You can use Java libraries (java.util) from Kotlin. For example, to get the day of the week:
>   ```
>   Calendar.getInstance().get(Calendar.DAY_OF_WEEK) 
>   ```
> * Type in the code, then press Option + Enter in Mac, or Alt + Enter in Windows, over the red `Calendar` class to import the library.
> * Use a `when` statement to print a string depending on the day. Sunday is the first day of the week.
>
> ### Solution Code
> ```
> fun dayOfWeek() {
>     println("What day is it today?")
>     val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
>     println( when (day) {
>         1 -> "Sunday"
>         2 -> "Monday"
>         3 -> "Tuesday"
>         4 -> "Wednesday"
>         5 -> "Thursday"
>         6 -> "Friday"
>         7 -> "Saturday"
>         else -> "Time has stopped"
>     })
> }
>```