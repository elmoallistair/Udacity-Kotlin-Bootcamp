# Practice Time
Earlier, we created and filtered a list of spices. Spices are much better represented as objects than as simple strings. Because they are objects, we can perform different things with them - such as cooking.

To recap, let's make a simple `Spice` class. It doesn't do much, but it will serve as the starting point for the next practice.
1. Create class, `SimpleSpice`.
2. Let the class be a property with a String for the name of the spice, and a String for the level of spiciness.
3. Set the name to `curry` and the spiciness to `mild`.
4. Using a string for `spiciness` is nice for users, but not useful for calculations. 
Add a `heat` property to your class with a getter that returns a numeric value for `spiciness`. 
Use a value of 5 for `mild`.
5. Create an instance of `SimpleSpice` and print out its `name` and `heat`.

## Solution Code
```
class SimpleSpice(){
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() { return 5 }
}
```
```
val simpleSpice = SimpleSpice()
println("${simpleSpice.name} ${simpleSpice.heat}")
```