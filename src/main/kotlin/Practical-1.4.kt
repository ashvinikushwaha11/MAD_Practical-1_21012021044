fun main()
{
    print("enter number: ")
    var num = readLine()!!.toInt()
    val a = if (num % 2==0)
       println("$num is even number");
    else
        println("$num is odd number");
}