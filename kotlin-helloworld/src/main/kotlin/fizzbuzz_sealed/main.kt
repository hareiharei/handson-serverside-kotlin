package fizzbuzz_sealed

// 'when'式は網羅的でなければならない

// 式として使わないとエラーが発生しない
fun a() {
    val x = 100
    when (x) {
        0 -> println("0")
    }
}

// 式として使うとエラー(elseがない)が発生する(一応網羅性の担保)
fun b() {
    val x = 100
    val y = when (x) {
        0 -> 0
    }
}

// enum class なら式として使わなくてもエラーが発生する
enum class Division {
    DIVISIBLE_BOTH_THREE_AND_FIVE,
    DIVISIBLE_THREE_AND_NOT_DIVISIBLE_FIVE,
    NOT_DIVISIBLE_THREE_AND_DIVISIBLE_FIVE,
    NOT_DIVISIBLE_THREE_AND_FIVE
}

fun c() {
    val x = Division.DIVISIBLE_BOTH_THREE_AND_FIVE
    when (x) {
        Division.DIVISIBLE_BOTH_THREE_AND_FIVE -> println("FizzBuzz")
    }
}