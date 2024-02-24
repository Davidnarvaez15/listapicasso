package com.david.listapicasso

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var ListaDatos: MutableList<dtproductos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ListaDatos.add(
            dtproductos("id del producto:2", "producto:harina", "precio por menudeo:150", "precio por mayoreo:130","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/arroz.jpg?alt=media&token=46385db4-103f-4aae-aa9e-deabc747647a")
        )
        ListaDatos.add(
            dtproductos("id:3", "producto: galletas", "precio menudeo: 140", "precio mayoreo: 110","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/cloro.jpg?alt=media&token=dc318bdb-995a-46e5-9a2f-d6c5883ce632")
        )
        ListaDatos.add(
            dtproductos("id: 4", "producto :jabon", "precio menudeo: 180", "precio mayoreo: 120","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/jabon.jpg?alt=media&token=a6118444-c4a0-4134-808d-08cfe98e9f24")
        )
        ListaDatos.add(
            dtproductos("id: 5", "producto: jamon", "precio menudeo: 100", "precio mayoreo: 90","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/jamon.jpg?alt=media&token=d8c96046-b8b1-4a93-af9a-825a4bc29a9c")
        )
        ListaDatos.add(
            dtproductos("id: 6", "producto: sopa instantanea", "precio menudeo: 200", "precio mayoreo: 170","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/sopa%20instantanea.jpg?alt=media&token=3e0ca8bb-2c61-4b1b-97fc-4b369f479879")
        )
        ListaDatos.add(
            dtproductos("id: 7", "producto: frijol", "precio menudeo :30", "precio mayoreo: 20","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/frijol.jpg?alt=media&token=477e224e-d961-4c87-8f9e-6e2049230206")
        )
        ListaDatos.add(
            dtproductos("id: 8", "producto: arroz", "precio  menudeo: 30", "precio mayoreo: 10","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/arrozz.jpg?alt=media&token=a7afe479-5643-4e6d-aa79-7976e52b5a77")
        )
        ListaDatos.add(
            dtproductos("id: 9", "producto: refresco", "precio menudoe: 50", "precio mayoreo: 40","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/refresco.jpg?alt=media&token=b6940b72-d2a3-4ed6-bbe5-3f33cef7ae2c")
        )
        ListaDatos.add(
            dtproductos("id: 10", "producto: cafe", "precio menudeo: 19", "precio mayoreo: 15","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/cafe.jpg?alt=media&token=89a45d56-8e07-46b7-a6ca-dd9633ea52e7")
        )
        ListaDatos.add(
            dtproductos("id: 11", "producto: azucar", "precio menudeo: 25", "precio mayoreo: 20","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/azucar.jpg?alt=media&token=48bc494e-8131-49db-a30e-34d3f08fcd75")
        )
        ListaDatos.add(
            dtproductos("id: 12", "producto: sabritas", "precio menudeo: 18", "precio mayoreo:12","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/sabrita.jpg?alt=media&token=9f7d5596-7dfc-4f63-91f2-ff6e6f6293ad")
        )
        ListaDatos.add(
            dtproductos("id: 13", "producto: sal", "precio menudeo: 18", "precio mayoreo: 14","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/sal.jpg?alt=media&token=cdbc5344-7aa1-4d1c-b9e7-f3d919b7355e")
        )
        ListaDatos.add(
            dtproductos("id: 14", "producto: cloro", "precio menudeo: 17", "precio mayoreo: 15","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/cloro.jpg?alt=media&token=dc318bdb-995a-46e5-9a2f-d6c5883ce632")
        )
        ListaDatos.add(
            dtproductos("id: 15", "producto: papel higienico", "precio menudeo: 25", "precio mayoreo: 20","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/papel%20higienico.jpg?alt=media&token=537fcc04-dece-4bec-aade-a7a755bff3a7")
        )
        ListaDatos.add(
            dtproductos("id: 16", "producto: queso amarillo", "precio menudeo: 18", "precio mayoreo: 16","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/queso_amarillo.jpg?alt=media&token=e4b69875-1010-4e66-8db5-e922efe136ae")
        )
        ListaDatos.add(
            dtproductos("id: 17", "producto: tortilla", "precio menudeo: 26", "precio mayoreo: 22","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/tortilla.jpg?alt=media&token=bdcb38c2-9be0-415b-a234-9dc29a895f6c")
        )
        ListaDatos.add(
            dtproductos("id: 18", "producto: pañales", "precio menudeo: 150", "precio mayoreo: 120","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/pa%C3%B1ales.jpg?alt=media&token=e704ade4-27de-483b-9527-acc3bb554e9c")
        )
        ListaDatos.add(
            dtproductos("id: 19", "producto: toallas femeninas", "precio menudeo: 20", "precio mayoreo: 18","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/toallas.jpg?alt=media&token=937af592-6a24-48d9-a10c-d2da2bff6300")
        )
        ListaDatos.add(
            dtproductos("id: 20", "producto: cerveza", "precio menudeo: 120", "precio mayoreo: 110","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/cerveza.jpg?alt=media&token=f068a465-5524-48b6-b8c3-577f283795db")
        )
        ListaDatos.add(
            dtproductos("id: 21", "producto: desodorante", "precio menudeo: 45", "precio mayoreo: 40","https://firebasestorage.googleapis.com/v0/b/picasso-df747.appspot.com/o/desodorante.jpg?alt=media&token=0779f7d9-a81f-4b9e-b7c4-34263fe9c0c6")
        )

        var tabla =findViewById<RecyclerView>(R.id.Datos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=productosAdapter(this, ListaDatos)
    }
}