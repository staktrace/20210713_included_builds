package com.squareup.test.project_a

import com.squareup.test.project_b.MyLib

class MyApp {
    fun main() {
        val mylib = MyLib(foo = "foo", bar = "bar")
        println(mylib)
    }
}
