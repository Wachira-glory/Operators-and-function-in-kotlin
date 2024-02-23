fun main() {
    modulus(5,6)
    sum(7,8,9,7)
    fact("I love singing ")
    fact("I love dancing")
    name("Ada")

}
fun modulus(num1:Int ,num2:Int):Int{
    var division=num1%num2
    println(division)
    println("hello")
    return division
}
fun sum(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum=num1 + num2 +num3+num4
    println(sum)
    return(sum)
}
fun fact(fact:String):String{
    println(fact)
    return fact
}
fun name(name:String){
    println("Hello ${name}")
}
