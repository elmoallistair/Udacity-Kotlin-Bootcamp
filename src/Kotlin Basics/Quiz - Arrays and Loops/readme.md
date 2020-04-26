# Quiz: Arrays and Loops

Read the code below, and then select the correct array initialization that will display the corresponding output.
```
val array = // initalize array here
val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
            "terabyte", "petabyte", "exabyte")
for ((i, value) in array.withIndex()) {
   println("1 ${sizes[i]} = ${value.toLong()} bytes")
}
```
Output:
```
1 byte = 1 bytes
1 kilobyte = 1000 bytes
1 megabyte = 1000000 bytes
1 gigabyte = 1000000000 bytes
1 terabyte = 1000000000000 bytes
1 petabyte = 1000000000000000 bytes
1 exabyte = 1000000000000000000 bytes
```

## Quiz Question
Which of the statements below is the correct way to initialize the array above to give the correct output.
* `val array = Array(7)`
* `val array = {1000}`
* `val array = Array(7){ 1000.0.pow(it) }`
* `val array = Array(7){ 1000.0.pow(10) }`

## Quiz Answer
> `val array = Array(7){ 1000.0.pow(it) }`