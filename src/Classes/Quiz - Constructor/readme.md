# Practice Time
Let's improve our `SimpleSpice` class so that we can have various spices with different levels of spiciness.
1. Create a new class, `Spice`.
2. Pass in a mandatory String argument for the `name`, and a String argument for the level of spiciness where the default value is `mild` for not spicy.
3. Add a variable, `heat`, to your class, with a getter that returns a numeric value for each type of `spiciness`.
4. Instead of the list of spices as Strings you used earlier, create a list of `Spice` objects and give each object a name and a `spiciness` level.
5. Add an `init` block that prints out the values for the object after it has been created. Create a `spice`.
6. Create a list of spices that are spicy or less than spicy. 
Hint: Use a filter and the `heat` property.
7. Because salt is a very common spice, create a helper function called `makeSalt()`.

## Solution Code
```
class Spice(val name: String, val spiciness: String = "mild") {
    private val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
}
```
```
val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
)
```
```
val spice = Spice("cayenne", spiciness = "spicy")
```
```
val spicelist = spices1.filter {it.heat < 5}
```
```
fun makeSalt() = Spice("Salt")
```