# Quiz: Strings
Read the code below, try to follow what it does, and then choose the correct answer:
```
var welcomeMessage = "Hello and welcome to Kotlin"
when (welcomeMessage.length) {
   0 -> println("Nothing to say?")
   in 1..50 -> println("Perfect")
   else -> println("Too long!")
}
```

## Quiz Question
What will the code above print?
* "Nothing to say?"
* "Perfect"
* "Too long!"
* It won't display anyting because there's a syntax error

## Quiz Answer
> "Perfect"