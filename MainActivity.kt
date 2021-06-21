package phonebook.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var create:Button
    lateinit var search:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        create=findViewById(R.id.btncreate)
        search=findViewById(R.id.btnSearch)

        create.setOnClickListener {
            var intent=Intent(baseContext,CreateActivity::class.java)
            startActivity(intent)
        }

        search.setOnClickListener{
            var intent2=Intent(baseContext,SearchActivity::class.java)
            startActivity(intent2)
        }
    }
}