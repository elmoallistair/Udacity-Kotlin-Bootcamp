## Practice Time: Basic Operations
Solve the following using the operator methods in one line of code.\
If you start with 2 fish, and they breed twice, producing 71 offspring the first time, and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel, how many fish do you have left? How many aquariums do you need if you can put 30 fish per aquarium?
* **Hint**: You can chain method calls.
* **Hint**: You can call the methods on numbers, and Kotlin will convert them to objects for you.
* **Bonus question**: What is special about all the numbers of fish?

### Solution Code
```
2.plus(71).plus(233).minus(13).div(30).plus(1)
```
### Bonus question answer: 
> If you've noticed, all fish numbers above are **prime**.
