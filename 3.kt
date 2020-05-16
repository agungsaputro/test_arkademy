fun main() {
    printHolloTriangle(6)
}
fun printHolloTriangle(n:Int){
    var x: Int
    var y: Int
    x= 1
    while (x <= n){
        y =1
        while (y < x){
            print("")
            y++
        }
        y=1
        while (y <= (n*2 - (2*x - 1))){
            if (x==1 || y==1 || y==(n*2-(2*x-1))){
                print("o")
            }else{
                print("x")
            }
            y++
        }
        println()
        x++
    }
}
