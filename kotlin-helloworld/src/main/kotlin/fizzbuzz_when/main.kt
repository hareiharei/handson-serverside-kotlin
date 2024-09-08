package fizzbuzz_when

fun fizzBuzz(i: Int): String {
    return when {
        i % 15 == 0 -> {
            "FizzBuzz"
        }
        i % 3 == 0 -> {
            "Fizz"
        }
        i % 5 == 0 -> {
            "Buzz"
        }
        else -> {
            "$i"
        }
    }
}