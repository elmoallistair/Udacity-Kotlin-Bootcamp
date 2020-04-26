# Practice Time
Using type hierarchies with generic classes follows a pretty basic pattern that we introduced in the previous segment. There was a lot of material introducing generics, but basically, when you are building them, it boils down to the following steps:

* Create a type/class hierarchy. The parent is non-specific and the sub-types/subclasses are specializations.
* There is at least one shared property between the classes/types, and it has a different value depending on the subtype (otherwise, having the sub-types is pointless).
* We then have a class that uses all the subtypes, and performs different actions depending on what the values of the subtype’s properties are.

Let’s put this into practice using building materials and a building that needs certain amounts of those materials.

1. Create a new package and file and call them `Buildings`.
2. Create a class `BaseBuildingMaterial` with a property `numberNeeded` that is set to 1. 
You always need 1 of the base material.
3. Create two subclasses, `Wood` and `Brick`. 
For `BaseBuildingMaterial` you need 4 units of wood or 8 units of brick. Now you have a type hierarchy.
4. Create a generic class `Building` that can take any building material as its argument, and only building materials.
5. A building always requires 100 base materials. 
Add a property `baseMaterialsNeeded` and set it to 100.
6. Add another property, `actualMaterialsNeeded` and use a one-line function to calculate this from `numberNeeded` of the passed-in material.
7. Add a method `build()` that prints the type and number of materials needed.
   * **Hint**: Use reflection to get the class and simple name: `instance::class.simpleName`
8. Create a main function and make a building using `Wood`.
9. If you did this correctly, running `main()` will print something like “400 Wood required”.

## Solution Code
```
open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<T: BaseBuildingMaterial>(val buildingMaterial: T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun main(args: Array<String>) {
    Building(Wood()).build()
}
```
Output
```
400 Wood required
```
