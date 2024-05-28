fun main() {
// apprach -1

    println(sumofNaturalNumber(readLine()!!.toInt()))

    // apprach -2

    println(sumOfNaturalNumberEquation(readln().toInt()))
}

fun sumOfNaturalNumberEquation(n: Int): Int {

    return n*(n+1)/2;

}


// apprach -1

fun sumofNaturalNumber(toInt: Int): Int {
    var sum = 0;
    for (i in 0..toInt) {
        sum += i;
    }
    return sum;
}


