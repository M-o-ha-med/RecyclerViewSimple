package lat.pam.recyclerview_prak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        val values = ArrayList<ItemModel>()
        val recyclerview = findViewById<RecyclerView>(R.id.meh)
        recyclerview.layoutManager = LinearLayoutManager(this)
        super.onCreate(savedInstanceState)

        for(i in 1..20){
            values.add(ItemModel("Item ke - ${i}"))
        }

        val adapter = AdapterCustom(values)
        recyclerview.adapter = adapter
    }
}