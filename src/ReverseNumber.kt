fun reverseNumber(number: Int): Int {
    var num = number // Create a mutable copy of the input number
    var reversed = 0 // Step 1: Initialize the reversed number
    while (num != 0) { // Step 2: Loop until the number is not zero
        val digit = num % 10 // Step 3: Extract the last digit
        reversed = reversed * 10 + digit // Step 4: Append the digit to reversed
        num /= 10 // Step 5: Remove the last digit
    }
    return reversed
}

fun main() {
    val number = 12345
    println("Reversed number: ${reverseNumber(number)}") // Output: Reversed number: 54321
}
