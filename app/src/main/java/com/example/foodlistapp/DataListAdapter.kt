package com.example.foodlistapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodlistapp.DataListAdapter.FoodViewHolder
import java.util.*

class DataListAdapter(private val mContext: Context, private val dataList: ArrayList<Foods>?):
        RecyclerView.Adapter<FoodViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,
                parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int)
    {
        holder.nameText.text = dataList!![position].name
        holder.costText.text = dataList[position].cost
        holder.image.setImageResource(mContext.resources.getIdentifier(
                dataList[position].image, "drawable", mContext.packageName))

        holder.itemView.setOnClickListener {
            val mydata = arrayOf(
                    dataList[position].name,
                    dataList[position].description,
                    dataList[position].cost,
                    dataList[position].image
            )
            mContext.startActivity(Intent(mContext, FoodActivity::class.java).putExtra("MYDATA", mydata))
        }
    }

    override fun getItemCount(): Int
    {
        return dataList?.size ?: 0
    }

    class FoodViewHolder(itemView: View) : ViewHolder(itemView)
    {
        val nameText: TextView = itemView.findViewById(R.id.foodName)
        val costText: TextView = itemView.findViewById(R.id.foodCost)
        val image: ImageView = itemView.findViewById(R.id.foodImage)
    }
}