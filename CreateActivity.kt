package phonebook.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CreateActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var phone:EditText
    lateinit var email:EditText
    lateinit var create:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
        name=findViewById(R.id.etName)
        phone=findViewById(R.id.etPhone)
        email=findViewById(R.id.etEmail)
        create=findViewById(R.id.btnCreates)
        var names=name.text.toString()
        var phones=name.text.toString()
        var emails=email.text.toString()

        create.setOnClickListener{
         var intent=Intent(baseContext,SearchActivity::class.java)
           intent.putExtra("personName", names)
            intent.putExtra("PhoneNumber",phones)
            intent.putExtra("emailAddress",emails)
            startActivity(intent)

        }
    }
}