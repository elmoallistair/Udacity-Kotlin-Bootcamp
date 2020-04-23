# Do the Following Tasks in REPL

## Practice Time
> 1. Create three String variables for `trout`, `haddock`, and `snapper`.
> 2. Use a String template to print whether you do or don't like to eat these kinds of fish.
> 
> ### Solution Code
> ```
> val trout = "trout"
> var haddock = "haddock"
> var snapper = "snapper"
> println("I like to eat $trout and $snapper, but not a big fan of $haddock.")
>```

## Practice Time
> `when` statements in Kotlin are like `case` or `switch` statements in other languages.
> Create a `when` statement with three comparisons:
> * If the length of the `fishName` is 0, print an error message.
> * If the length is in the range of 3...12, print "Good fish name".
> * If it's anything else, print "OK fish name".
>
> ### Solution Code
> ```
> when(fishName.length) {
> 	0 -> println("Fish name cannot be empty")
> 	in 3..12 -> println("Good fish name")
> 	else -> println("OK fish name")
> }
> ```