package com.example.foodlistapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity()
{
    private var recyclerView: RecyclerView? = null
    private var adapter: DataListAdapter? = null
    private var foodArrayList: ArrayList<Foods>? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addData()

        recyclerView = findViewById(R.id.recyclerView)
        adapter = DataListAdapter(this@MainActivity, foodArrayList)

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = adapter
        recyclerView?.layoutManager = layoutManager
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {
        menuInflater.inflate(R.menu.menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when (item.itemId)
        {
            R.id.about_button ->
            {
                startActivity(Intent(this, About::class.java))
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun addData()
    {
        foodArrayList = ArrayList()
        foodArrayList!!.add(
                Foods(
                        "Pecel Lele",
                        "Lele dengan segala lalapan yang mantap.",
                        "14,000 IDR",
                        "pecel_lele"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Nasi Goreng Spesial",
                        "Nasi goreng dengan tambahan kornet sapi, sosis, daging asap dan telur.",
                        "20,000 IDR",
                        "nas_gor_sosis"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Ayam Geprek Mozarella",
                        "Ayam geprek dengan pedas level 0-10 berbalut keju mozarella yang lumer.",
                        "16,000 IDR",
                        "geprek_moza"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Kari Ayam",
                        "Kari ayam khas Negara Matahari Terbit",
                        "10,000 IDR",
                        "kari_ayam"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Tahu Pong",
                        "Tahu khas Semarang yang renyah, bolong didalamnya.",
                        "8,000 IDR",
                        "tahu_pong"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Salad With Peanut Sauce",
                        "Sebuah salad berbagai sayuran bertabur saus kacang alias PECEL.",
                        "10,000 IDR",
                        "pecel"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Mie-Kirin Kamu",
                        "Makanan panjang-panjang, setiap dimakan akan selalu memikirkanmu.",
                        "9,000 IDR",
                        "mie_kirin_kamu"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Boba Tea",
                        "Minuman teh ala-ala kekinian dengan bola kenyal-kenyal.",
                        "10,000 IDR",
                        "boba_tea"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Telur Gulung",
                        "Telur digoreng, lalu digulung-gulung tapi jangan dipeluk.",
                        "5,000 IDR",
                        "telur_gulung"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Seblak",
                        "Makanan favorit sejuta kaum hawa, tapi di Indonesia aja.",
                        "10,000 IDR",
                        "seblak"
                )
        )
        foodArrayList!!.add(
                Foods(
                        "Nugget Pisang",
                        "Pisang digoreng tapi bukan gorengan pisang.",
                        "7,500 IDR",
                        "sang_pisang"
                )
        )
    }
}