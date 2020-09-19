package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val people = arrayListOf<Person>()
        for(i in 0..30) {
            people.add(Person("이름 $i", 10) )
        }

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = PersonAdapter(people) {person ->
                Toast.makeText(this@MainActivity, "$person", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
