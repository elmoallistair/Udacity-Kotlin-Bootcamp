# Practice Time
Create a program that suggests an activity based on various parameters.
1. Start in a new file with a `main` function.
2. From `main()`, create a function, `whatShouldIDoToday()`.
3. Let the function have three parameters.
    * `mood`: a required string parameter
    * `weather`: a string parameter that defaults to "sunny"
    * `temperature`: an Integer parameter that defaults to 24 (Celsius).
4. Use a `when` construct to return some activities based on combinations of conditions. For example:
    ```
    mood == "happy" && weather == "Sunny" -> "go for a walk"
    else -> "Stay home and read."
    ```
5. Copy/paste your finished function into REPL, and call it with combinations of arguments. For example:
    ```
    whatShouldIDoToday("sad")
    > Stay home and read.
    ```
**Note**: Keep your work as you will do more with this code in the next practice.

## Solution Code
```
fun main(args: Array<String>) {
   println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
   return when {
      mood == "happy" && weather == "Sunny" -> "go for a walk"
      else -> "Stay home and read."
   }
}
```