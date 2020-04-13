# Practice Basic Operations in Kotlin

When it comes to basic operations, it's a good thing for this to become automatic, something less to think about while you are trying to figure out the solution to your actual programming challenge. There is only one road to automaticity, and that's practice. The following are some starting points for playing in REPL with the operations and concepts introduced in this lesson.

## Practice Time: Basic Operations
> Solve the following using the operator methods in one line of code.
> If you start with 2 fish, and they breed twice, producing 71 offspring the first time, and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel, how many fish do you have left? How many aquariums do you need if you can put 30 fish per aquarium?
> * **Hint**: You can chain method calls.> 
> * **Hint**: You can call the methods on numbers, and Kotlin will convert them to objects for you.
> * **Bonus question** : What is special about all the numbers of fish?
> ### Solution Code
> ```
> 2.plus(71).plus(233).minus(13).div(30).plus(1)
> ```
> ### Bonus question answer: 
> If you've noticed, all fish numbers above are **prime**.


## Practice Time: Variables
> 1. Create a String variable rainbowColor, set its color value, then change it.
> 2. Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
> ### Solution Code
> ```
> var rainbowColor = "red"
> rainbowColor = "blue"
> val blackColor = "black"
> blackColor = "white" 	// Error
> ```

## Practice Time: Nullability
> * Try to set `rainbowColor` to `null`. 
> Declare two variables, `greenColor` and `blueColor`. 
> Use two different ways of setting them to `null`.
> #### Solution Code
> ```
> var greenColor = null
> var blueColor: Int? = null
> ```

## Practice Time: Nullability/Lists
> * Create a list with two elements that are null; do it in two different ways.
> * Next, create a list where the list is null.
> ### Solution Code
> ``` 
> listOf(null,null)
> [null, null]
> var list: List<Int?> = listOf(null, null)
> var list2:List<Int>? = null
> ```
> 
## Practice Time: Null Checks
> * Create a nullable integer variable called `nullTest`, and set it to `null`. 
> Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.
> **Hint**: Use the Elvis operator.
> ### Solution Code
> ```
> println(nullTest?.inc() ?:0)
> ```