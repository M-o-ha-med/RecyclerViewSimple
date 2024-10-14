package lat.pam.recyclerview_prak
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterCustom(private val listOfItem :List<ItemModel>) : RecyclerView.Adapter<AdapterCustom.viewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carview_template, parent, false)
        return viewHolder(view)

    }

    override fun getItemCount(): Int {
        return listOfItem.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val valModel = listOfItem[position]
        holder.textholder.text = valModel.string
    }

    class viewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val textholder : TextView = itemView.findViewById(R.id.textnihboss)
    }

}