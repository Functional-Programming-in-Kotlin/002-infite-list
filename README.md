Make infinite List using lazy evaluation, in this case using **generateSequence**

```
fun main(args: Array<String>) {
    generateSequence(0) { number -> number + 2 }
        .take(100)
        .forEach { number ->
            print(number)
        }
}
```