package com.example.marvelcharacters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycleview.Image

class MainActivity : AppCompatActivity() {
    private lateinit var  recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView=findViewById(R.id.recyclerview)

        val products= ArrayList<Image>()

        products.add(Image("https://www.shutterstock.com/image-photo/autumn-forest-poland-1723205002"))
        products.add(Image("https://www.shutterstock.com/image-photo/boardwalk-into-blue-ocean-thailand-1666330522"))
        products.add(Image("https://www.shutterstock.com/image-photo/majestic-sunset-mountains-landscape-wonderful-nature-1487897981"))
        products.add(Image("https://www.shutterstock.com/image-photo/mountain-lake-lai-da-marmorera-switzerland-1226011726"))
        products.add(Image("https://www.shutterstock.com/image-photo/autumn-forest-poland-1723205002"))
        products.add(Image("https://www.shutterstock.com/image-photo/boardwalk-into-blue-ocean-thailand-1666330522"))
        products.add(Image("https://www.shutterstock.com/image-photo/majestic-sunset-mountains-landscape-wonderful-nature-1487897981"))
        products.add(Image("https://www.shutterstock.com/image-photo/mountain-lake-lai-da-marmorera-switzerland-1226011726"))
        products.add(Image("https://www.shutterstock.com/image-photo/boardwalk-into-blue-ocean-thailand-1666330522"))
        products.add(Image("https://www.shutterstock.com/image-photo/majestic-sunset-mountains-landscape-wonderful-nature-1487897981"))
        products.add(Image("https://www.shutterstock.com/image-photo/mountain-lake-lai-da-marmorera-switzerland-1226011726"))
        products.add(Image("https://www.shutterstock.com/image-photo/autumn-forest-poland-1723205002"))
        products.add(Image("https://www.shutterstock.com/image-photo/boardwalk-into-blue-ocean-thailand-1666330522"))
        products.add(Image("https://www.shutterstock.com/image-photo/majestic-sunset-mountains-landscape-wonderful-nature-1487897981"))
        products.add(Image("https://www.shutterstock.com/image-photo/mountain-lake-lai-da-marmorera-switzerland-1226011726"))


        val adapter=ProductAdapter(products)

        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=adapter

    }

}