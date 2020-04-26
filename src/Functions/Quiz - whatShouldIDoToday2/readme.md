# Practice Time
Improve your `whatShouldIDoToday()` program with the new knowledge from this segment.
1. Add 3 more situations and activities. For example:
    ```
    mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed" 
    temperature > 35 -> "go swimming"
    ```
2. Create a single-expression function for each condition and then use it in your `when` expression.

## Challenge
Instead of passing in the mood, get a mood string from the user.
**Hint**: The !! operator may come handy.

## Loops
This lesson introduced the while and repeat loops. To practice using them, do the following:
	* Change your fortune cookie program to use `repeat()` instead of a `for` loop. What happens to the break instruction? Using the error message from the compiler, with what you've learned so far, can you think of why?
    * Change your fortune cookie program to use a `while` loop, which is the better choice when you are looping until a condition is met.

## Solution Code
```
fun main(args: Array<String>) {
   println(whatShouldIDoToday("happy", "sunny"))
   println(whatShouldIDoToday("sad"))
   print("How do you feel?")
   println(whatShouldIDoToday(readLine()!!))
}

fun isVeryHot (temperature: Int) = temperature > 35
fun isSadRainyCold (mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
   return when {
      isVeryHot(temperature) -> "go swimming"
      isSadRainyCold(mood, weather, temperature) -> "stay in bed"
      isHappySunny(mood, weather) -> "go for a walk"
      else -> "Stay home and read."
   }
}
```