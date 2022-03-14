fun main() {

    //1.
    val arr = arrayOf(40,40,2,3,1)
    print(arithmetic(arr))

    //2.
    val input = "11411"
    print(isPalindrome(input))

}




fun isPalindrome(str:String): Boolean {
    val reversed = str.reversed()
    return reversed == str
}


fun arithmetic(array: Array<Int>): Double {
    var sum = 0;
    var count = 0;

    for(i in array.indices){
        if(i % 2 == 0 ){
            sum += array[i]
            count ++

        }
    }
    return (sum.toDouble() / count)
}