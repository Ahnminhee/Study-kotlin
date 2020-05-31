package com.example.sentikotlin

fun main() {
   /* var arr1 = listOf("1", "2") //수정 가능
    var arr2 = mutableListOf("1" ,"2") //수정 불가능

    //반복문
    for(item in arr1) {
        println(item)
    }

    for((index, item) in arr1.withIndex()) {
        println("$index, $item")
        arr2.removeAt(0)
    }

    var hello: Any = "hello"
    if(hello is String) {
        var str: String = hello
    }*/

    var num: IntRange = 0..10

    for(i in num ) {
        print(num)
    }
}