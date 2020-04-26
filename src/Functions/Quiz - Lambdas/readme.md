## Quiz Question
What is the difference between
```
val random1 = random()
val random2 = {random()}
```
Try it out in REPL or a file:
* They both are exactly the same.
* The first will generate a random number every time random1 is acessed.
* The second will generate a random number every time random2 is accessed.
* They will both generate a random number every time but the return type will be different.

### Quiz Answer
> The second will generate a random number every time random2 is accessed.

## Practice Time: Lambdas
> 1. Create a lambda and assign it to `rollDice`, which returns a dice roll (number between 1 and 12).
> 2. Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
> 3. If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
> 4. Create a new variable, `rollDice2`, for this same lambda using the function type notation.
> 
> ### Solution Code
> ```
> val rollDice = { Random().nextInt(12) + 1}
> ```
> ```
> val rollDice = { sides: Int ->
>     Random().nextInt(sides) + 1
> }
> ```
> ```
> val rollDice0 = { sides: Int ->
>     if (sides == 0) 0
>     else Random().nextInt(sides) + 1
> }
> ```
> ```
> val rollDice2: (Int) -> Int = { sides ->
>     if (sides == 0) 0
>     else Random().nextInt(sides) + 1
> }
> ```

## Practice Time: Extra Questions
> 1. Why would you want to use the function type notation instead of just the lambda?
> 2. Create a function `gamePlay()` that takes a roll of the dice as an argument and prints it out.
> 3. Pass your `rollDice2` function as an argument to `gamePlay()` to generate a dice roll every time `gamePlay()` is called.
> 
> ### Solution Code
> ```
> gamePlay(rollDice2(4))
> fun gamePlay(diceRoll: Int){
>    // do something with the dice roll
>    println(diceRoll)
> }
> ```