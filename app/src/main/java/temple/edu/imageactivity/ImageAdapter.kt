package temple.edu.imageactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(
    private val context: Context,
    private val dogList:List<Int>,
    private val itemList:List<String>,
    private val listener:ImageOperations
    ): RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_listout,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(dogList[position])
        holder.imageView.setOnClickListener(View.OnClickListener {
        listener.OnItemClicked(itemList[position],dogList[position])
    })
}

    override fun getItemCount(): Int {
        return dogList.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView= itemView.findViewById(R.id.dog_image)

    }
    interface ImageOperations {
        fun onImageClicked(name:String, image:Int)
        abstract fun OnItemClicked(s: String, i: Int)

    }
    }






