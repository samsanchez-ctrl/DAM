

fun main(){
    for(i in 1..20){
        if(i == 5) continue
        if(i in 11..19) continue
        println("vamos en el valor $i")
    }
}