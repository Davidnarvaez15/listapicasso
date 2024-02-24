package com.david.listapicasso

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class productosAdapter(var context: Context,
    var ListaDatos: MutableList<dtproductos>): RecyclerView.Adapter<productosAdapter.vHolder>() {

    inner class vHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var txtid: TextView

        init {
            txtid = itemView.findViewById(R.id.txtId)
        }

        lateinit var txtdescripcion: TextView

        init {
            txtdescripcion = itemView.findViewById(R.id.txtDescripcion)
        }

        lateinit var txtpreciomenudeo: TextView

        init {
            txtpreciomenudeo = itemView.findViewById(R.id.txtMenudeo)
        }

        lateinit var txtpreciomayoreo: TextView

        init {
            txtpreciomayoreo = itemView.findViewById(R.id.txtMayoreo)
        }

        lateinit var txtimagen: ImageView

        init {
            txtimagen = itemView.findViewById(R.id.imagen)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vHolder {
        var itemView= LayoutInflater.from(context).inflate(
            R.layout.vista_datos,parent,false
        )
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaDatos.size
    }

    override fun onBindViewHolder(holder: vHolder, position: Int) {
     var datos=ListaDatos[position]
        holder.txtid.text=datos.id
        holder.txtdescripcion.text=datos.descripcion
        holder.txtpreciomenudeo.text=datos.preciomenudeo
        holder.txtpreciomayoreo.text=datos.preciomayoreo
        Picasso.get().load(datos.url).into(holder.txtimagen)
    }

}
