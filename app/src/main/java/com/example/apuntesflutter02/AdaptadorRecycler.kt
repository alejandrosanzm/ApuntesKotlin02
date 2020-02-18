package com.example.apuntesflutter02

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_cell.view.*

// Le pasamos los items por parámetro
class AdaptadorRecycler(items: ArrayList<Pojo>) :
    RecyclerView.Adapter<AdaptadorRecycler.ViewHolder>() {
    var items: ArrayList<Pojo>? = null
    var viewHolder: ViewHolder? = null

    init {
        this.items = items
    }

    // Crea la vista(ViewHolder)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdaptadorRecycler.ViewHolder {
        val newView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.activity_recycler_cell, parent, false)
        viewHolder = ViewHolder(newView)
        return viewHolder!!
    }

    override fun getItemCount(): Int {
        return items?.count()!!
    }

    // Por último
    // Asignamos los elementos de item a nuestra vista
    override fun onBindViewHolder(holder: AdaptadorRecycler.ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.texto1?.text = item?.text1
        holder.texto2?.text = item?.text2
        holder.texto3?.text = item?.text3
    }

    // Importante
    // Inicializa la vista finalmente con los valores
    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var vista = v
        var texto1: TextView? = null
        var texto2: TextView? = null
        var texto3: TextView? = null

        init {
            texto1 = vista.cellTxtUno
            texto2 = vista.cellTxtDos
            texto3 = vista.cellTxtTres
        }
    }
}
