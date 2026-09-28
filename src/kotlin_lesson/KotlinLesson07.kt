package kotlin_lesson

fun main(){
fromOneToFive()
       fromFiveToOne()
       evenNumber()
       downTwo()
       fromOneToNine()
       fromOneToTwenty()
       sizeFunction()
      quad()
      fromTenToFive()
      doFiveToOne()
      doFromFiveToTen()
      breakOnSix()
    infinityButTenBreak()
    continueTwo()
    continueTheree()
}

//1
fun fromOneToFive(){
    for (i in 1..5) {
        println(i)
    }
}
//2
fun evenNumber(){
    for (i in 0..10 step 2){
        if (i % 2 == 0){
            println(i)
        }
    }
}



//3
fun fromFiveToOne(){
    for (i in 10 downTo 1 ) {
        println(i)
    }
}

//4
fun downTwo(){
    for (i in 10 downTo 1  step 2){
        println(i)


    }
}

//5
fun fromOneToNine(){
    for (i in 1 .. 9 step 2){
        println(i)
    }
}
//6
fun fromOneToTwenty(){
    for (i in 1..20){
        if (i % 3 == 0){
            println(i)
        }
    }
}

//7
fun sizeFunction(){
    val size = readln().toInt()
    for (i in 3 until size step 2){
        println(i)
    }
}

//8

fun quad(){
    var number = 1
    while (number != 5){
        val result = number * number
        number ++
        println(result)
    }
}
//9

fun fromTenToFive(){
    var number = 10
    while(number > 5){
        number --
        println(number)
    }
}

//10

fun doFiveToOne(){
    var number = 5
    do{
        number --
        println(number)
    }
    while(number > 1)
}

//11
fun doFromFiveToTen(){
    var number = 5
    do{
        number ++
        println(number)
    }
    while(number < 10)
}

//12
fun breakOnSix(){
    var number = 1
    while (number  < 10){
        println(number)
        number ++
        if(number == 6){
            break
        }

    }
}

//13

fun infinityButTenBreak(){
    var number = 1
    while(true){
        println(number)
        number ++
        if(number == 10){
            break
        }
    }
}

//14

fun continueTwo(){
    var number = 1
    while ( number < 10){
        number ++
        if(number % 2 != 0) {
            println(number)
            continue
        }



    }
}
//15
fun continueTheree() {
    var number = 1
    while (number < 10) {
        number++
        if (number % 3 != 0) {
            println(number)
            continue
        }
    }
}
