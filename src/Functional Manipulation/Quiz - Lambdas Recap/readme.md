# Practice Time
In this practice, you are going to write the the first part of a higher-order functions game. You will implement everything, except the higher-order functions. Let’s get started.

1. Create a new file.
2. Create an enum class, `Directions`, that has the directions `NORTH`, `SOUTH`, `EAST` and `WEST`, as well as `START`, and `END`.
3. Create a class `Game`.
4. Inside `Game`, declare a var, `path`, that is a mutable list of `Direction`. 
Initialize it with one element, `START`.
5. Create 4 lambdas, `north`, `south`, `east`, and `west`, that add the respective direction to the path.
6. Add another lambda, `end`, that:
    * Adds `END` to path
    * Prints “Game Over”
    * Prints the path
    * Clears the path
    * Returns `false`
7. Create a main function.
8. Inside main(), create an instance of Game.
9. To test your code so far, in main() print the path, then invoke north, east, south, west, and end. Finally, print the path again.

You should see this output:
> ```
> [START]
> Game Over: [START, NORTH, SOUTH, EAST, WEST, END]
> []
> ```
You will finish your game as the last practice in this course.

## Solution Code
```
enum class Direction {
    NORTH, EAST, WEST, SOUTH, START, END
}

class Game {
    var path = mutableListOf<Direction>(Direction.START)
    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }
    val end = { path.add(Direction.END); println("Game Over: $path"); path.clear(); false }
}

fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)
}
```