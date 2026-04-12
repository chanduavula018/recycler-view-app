package com.example.recyclerviewapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val itemList = listOf(
            Item("Apple"),
            Item("Banana"),
            Item("Mango"),
            Item("Orange"),
            Item("Grapes"),
            Item("Pineapple"),
            Item("Papaya"),
            Item("Strawberry"),
            Item("Kiwi"),
            Item("Guava"),
            Item("Cherry"),
            Item("Blueberry"),
            Item("Peach"),
            Item("Plum"),
            Item("Pear"),
            Item("Lychee"),
            Item("Dragon Fruit"),
            Item("Pomegranate"),
            Item("Apricot"),
            Item("Fig"),
            Item("Coconut"),
            Item("Blackberry"),
            Item("Raspberry"),
            Item("Passion Fruit"),
            Item("Jackfruit")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(itemList)
    }
}