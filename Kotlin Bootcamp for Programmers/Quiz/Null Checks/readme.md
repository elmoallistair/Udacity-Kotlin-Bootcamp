## Practice Time: Null Checks
* Create a nullable integer variable called `nullTest`, and set it to `null`. 
Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.

**Hint**: Use the Elvis operator.

### Solution Code
```
println(nullTest?.inc() ?:0)
```
