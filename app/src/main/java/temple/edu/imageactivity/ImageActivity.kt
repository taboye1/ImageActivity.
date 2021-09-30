package temple.edu.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

 class ImageActivity :AppCompatActivity(),ImageAdapter.ImageOperations  {
    lateinit var PetName:TextView
    lateinit var dogImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PetName = findViewById(R.id.dog_name)
        dogImage = findViewById(R.id.dog_image)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(this,3)
        val dogList = listOf<Int>(R.drawable.dog1,R.drawable.dog2,R.drawable.dog3,R.drawable.dog4,R.drawable.dog5,
            R.drawable.dog6,R.drawable.dog7,R.drawable.dog8,R.drawable.dog9,R.drawable.dog10)

        val PetsName = listOf<String>("Mama Dog", "Puppy", "Golden Dog", "Tredo", "Jack", "FriendShip",
            "Bobi","Jackey", "Box", "Relax")

        recyclerView.adapter = ImageAdapter(this, dogList, PetsName, this)

    }

      override fun onItemClicked(name: String, image: Int) {
         PetName.text =name;dogImage.setImageResource(image)
     }



 }

