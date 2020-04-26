# Practice Time
Create a generic function for type `BaseBuildingMaterial` and call it `isSmallBuilding`, which takes a `Building` with a building material T as an argument. If the materials needed are less than 500, print "small building", otherwise, print "large building".

**Note**: For this function, IntelliJ recommends not to inline the function. Generally, when you create a generic function, follow the IDE's recommendation about inlining.

## Solution Code
```
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}
isSmallBuilding(Building(Brick()))
```