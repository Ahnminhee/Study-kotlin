package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alert(title = "Message", message = "To the world") {
            negativeButton("여긴 엔쒸리~" ){
                longToast("mark lee is love")
            }
            positiveButton("세상을 가지자!"){
                toast("어차피 세상은 마크 소유")
            }
        }.show()

    }
}

