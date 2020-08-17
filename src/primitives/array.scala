package primitives

object array{
	// Declaring arrays
	val arr1: Array[Int] = new Array[Int](3)
	val arr2 = new Array[Int](3)
	val arr3 = Array(1,2,3,4,5)

	def main(args: Array[String]): Unit = {
		// Initializing with values
		arr1(0) = 1
		arr1(1) = 2
		arr1(2) = 3

		arr2(0) = 1
		arr2(1) = 1
		arr2(2) = 1

		println("\n======= Iterating with for loop ========")
		for (i <- arr1){
			println(i)
		}

		println("\n======= Iterating with for loop + index ========")
		for(i <- arr1.indices){
			// String interpolation
			println(s"Value at index ${i} is ${arr1(i)}")
		}


		println("\n======= Iterating with \"for comprehension\" ========")
		for (i <- arr1) println(i)


		println("\n======= \"for comprehension\" with if condition ========")
		for (i <- arr1 if i % 2 == 0)
			println(i)

		println("\n======= Iterating with Lambdas ========")
		arr1.foreach{ println}

		var sum = 0
		arr1.foreach{ sum += _}
		println(s"sum : ${sum}")

		println("\n======= Lambdas with Index ========")
		arr1.zipWithIndex.foreach{ case(i, idx) =>
			println(s"Value at index $idx : $i")
			// OR
			// println(s"Value at index ${idx} : ${i}")
		}
	}
}
