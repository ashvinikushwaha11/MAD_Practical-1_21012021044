fun main()
{
    fun add(a:Int,b:Int,c:Int) {
        var addition = a+b+c
        println("Addition of $a $b $c is : $addition")
    }
    fun sub(a:Int,b:Int,c:Int){
        var minus = a-b-c
        println("Substraction of $a $b $c is : $minus")
    }
    fun mul(a:Int,b:Int,c:Int){
        var multi = a*b*c
        println("Multiplication of $a $b $c is : $multi")
    }
    fun div(a:Int,b:Int,c:Int){
        var division = b/a
        println("Division of $b $a is : $division")
    }
    add(10,20,30)
    sub(10,20,30)
    mul(10,20,30)
    div(10,20,30)
}