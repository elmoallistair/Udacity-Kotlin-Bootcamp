# Practice Time

That was a lot of explanations. Fortunately, IntelliJ gives you hints as to whether something should be an in or out type in your current code.

Look at the code from the previous practice and consider whether it can be an in type or an out type.
Notice that the parameter is underlined gray, and if you hover over T, IntelliJ will suggest to make it an “out” type.


## Solution Code
```
class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T)
```