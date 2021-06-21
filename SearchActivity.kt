package phonebook.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SearchActivity : AppCompatActivity() {
    lateinit var contacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)


        var intent=intent
//        var namess=intent.getStringExtra("personName")
        var jina=intent.getStringExtra("personName")
       var namba= intent.getStringExtra("PhoneNumber")
       var barua= intent.getStringExtra("emailAddress")

        var details= listOf(
            Details("Victorine Amani","07123456789","victorine@gmail.com"),
        Details("Favour Kimori","0712345098","favour@gmail.com"),
        Details("Hezborn Omondi","0798653412","Hezborn@gmail.com"),
        Details("Elizabeth Imaa","0795683412","imaa@gmail.com"),
        Details("Richard Omutoj","0730812539","omutoj@gmail.com"),
        Details("Aaron Imaa","0760423498","aaron@gmail.com"),
            Details(jina,namba, barua))



        contacts=findViewById(R.id.rvContacts)
        var coursesAdapter=DetailsAdapter(details)
        contacts.layoutManager= LinearLayoutManager(baseContext)
        contacts.adapter=coursesAdapter


    }

}