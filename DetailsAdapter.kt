package phonebook.com

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailsAdapter(var detailList: List<Details>):RecyclerView.Adapter<DetailsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return DetailsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        var currentdata=detailList.get(position)
        holder.personName.text=currentdata.name
        holder.phone.text=currentdata.phone
        holder.address.text=currentdata.email
       
    }

    override fun getItemCount(): Int {
      return detailList.size
    }

}
class DetailsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var personName=itemView.findViewById<TextView>(R.id.tvName)
    var phone=itemView.findViewById<TextView>(R.id.tvPhone)
    var address=itemView.findViewById<TextView>(R.id.tvEmail)


}