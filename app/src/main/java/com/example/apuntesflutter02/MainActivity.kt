package com.example.apuntesflutter02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var data: ArrayList<Pojo>? = null
    var recycler: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var adaptador: AdaptadorRecycler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = ArrayList()
        data?.add(Pojo("1", "Ejemplo", "Lorem ipsum."))
        data?.add(Pojo("2", "Palabra", "Texto"))
        data?.add(Pojo("3", "Árbol", "Hoja"))

        // 3 Últimos pasos
        // Añadido grafficamente como widget
        recycler = findViewById(R.id.lista)
        // Permite especifficar forma de la lista
        layoutManager = LinearLayoutManager(this)
        adaptador = AdaptadorRecycler(data!!)
        recycler?.layoutManager = layoutManager
        recycler?.adapter = adaptador
    }
}
