package com.example.foodlistapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FoodActivity : AppCompatActivity()
{
    private var foodName: TextView? = null
    private var foodDesc: TextView? = null
    private var foodCost: TextView? = null
    private var foodImage: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        foodName = findViewById(R.id.foodName)
        foodDesc = findViewById(R.id.foodDescription)
        foodCost = findViewById(R.id.foodCost)
        foodImage = findViewById(R.id.foodImage)

        if (intent.extras != null)
        {
            val mydata = intent.extras!!.getStringArray("MYDATA")
            foodImage?.setImageResource(resources.getIdentifier(mydata?.get(3), "drawable", packageName))
            foodName?.text = mydata?.get(0)
            foodDesc?.text = mydata?.get(1)
            foodCost?.text = mydata?.get(2)
        }
    }
}