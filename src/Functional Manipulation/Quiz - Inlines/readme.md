# Practice Time
In this practice, you will finish your simple game using higher-order functions, that is, a function that takes functions as an argument.

1. In the game class, create a function `move()` that takes an argument called `where`, which is a lambda with no arguments that returns `Unit`.

    **Hint**: Declaring a function that takes a lambda as its argument:
    ```
    fun move(where: () -> Boolean )
    ```
2. Inside `move()`, invoke the passed-in lambda.
3. In the `Game` class, create a function `makeMove()` that takes a nullable String argument and returns nothing.
4. Inside `makeMove`, test whether the String is any of the 4 directions and invoke `move()` with the corresponding lambda. Otherwise, invoke `move()` with end.

    **Hint**: You can call the function like this:
    ```
    move(north)
    ```
5. In `main()` add a while loop that is always true.
6. Inside the loop, print instructions to the player:
    ```
    print("Enter a direction: n/s/e/w:")
    ```
7. Call `makeMove()` with the contents of the input from the user via `readLine()`
8. Remove the code for testing the first version of your game.
9. Run your program.

## Challenge:
Create a simple “map” for your game, and when the user moves, show a description of their location. Consider the following:

* Use a Location class that takes a default width and height to track location. 4x4 is pretty manageable.
* You can create a matrix like this:
    ```
    val map = Array(width) { arrayOfNulls<String>(height) }
    ```
* Use an init block to initialize your map with descriptions for each location.
* When you `move()` also `updateLocation()`. There is some math involved to prevent null-pointer exceptions and keep the user from walking off the map. `rem()` and `absoluteValue` come handy.
* When you are done, zip up the code and send it to a friend to try your first Kotlin game.

## Solution Code
```
fun move(where: () -> Boolean ) {
   where.invoke()
}
```
```
fun makeMove(command:String?) {
   if (command.equals("n")) move(north)
   else if (command.equals("s")) move(south)
   else if (command.equals("e")) move(east)
   else if (command.equals("w")) move(west)
   else move(end)
}
```
```
while (true) {
   print("Enter a direction: n/s/e/w: ")
   game.makeMove(readLine())
}
```