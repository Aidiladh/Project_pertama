// if
// if else
// if else if
// when = switch case

fun main (){
    val UTS: Int = 60
    val UAS: Int = 80
    val NA: Double = (0.4 * UTS) + (0.6 * UAS)
    println(NA)
    if (NA > 80){
        println("selamat anda lulus")
    }
    else println("anda cuti")
}
//when
val x = 17
val result = when (x){
    3,4,5,6-> print("it is sumer season")
    6,7,8,9-> print("it is rainy season")
    8,10,11-> print("it is autumn season")
    10,12,1,2->print("it is autumn season")

    else -> println("invalid input")
}
