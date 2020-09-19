package com.example.sentikotlin

fun main() {
    var map = mapOf(Pair("name","minhee")) //-> 수정x
    var map2 = mutableMapOf<String, String>() //->수정 o
    map2.put("name","mark")
    map2.put("age","22")

    print(map2.keys)
    for(i in map2) {
        println(i.value)

    }

}