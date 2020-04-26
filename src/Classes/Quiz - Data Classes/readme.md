# Practice Time
1. Create a simple data class, `SpiceContainer`, that holds one spice.
2. Give `SpiceContainer` a property, `label`, that is derived from the name of the spice.
3. Create some containers with spices and print out their labels.

## Solution Code
```
data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}
```
```
val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

for(element in spiceCabinet) println(element.label)
```