<details>
  <summary> Java vs Scala</summary>    
  They run at the same speed, Scala compiles slower, Scala is better in terms of productivity. It depends on what you are doing
  
  Concurrency Model
  
  Scala uses the actor model which is both modern and more efficient than Java
  
  Performance
  
  Scala compiler supports an optimization technique called tail call recursion. The optimization makes the Scala code compile faster than Java code.
</details>

---
2 Ways of creating Driver File
1. ```
    object HelloWorld2 extends App{
        println("Hwasfsdg")
    }
    ```
2.  ```
    object Main {
        def main(args: Array[String]): Unit = {
            println("Hello, world!")
    }
    ```
