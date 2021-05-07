
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.covidresourceskotlin.Models.StateModelData
import com.example.covidresourceskotlin.R

internal class State_Adapter(private var moviesList: List<StateModelData>) :
    RecyclerView.Adapter<State_Adapter.MyViewHolder>() {
    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.state_name)
        var Ccases: TextView = view.findViewById(R.id.Ccases)
        var Dcases: TextView = view.findViewById(R.id.Dcases)
        var deaths: TextView = view.findViewById(R.id.deaths)
    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.cities_item_view, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = moviesList[position]
        holder.title.text = movie.getTitle()
        holder.Ccases.text = movie.getCcases()
        holder.Dcases.text = movie.getDcases()
        holder.deaths.text = movie.getdeaths()
    }
    override fun getItemCount(): Int {
        return moviesList.size
    }
}