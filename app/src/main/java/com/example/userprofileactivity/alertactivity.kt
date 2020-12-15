package com.example.userprofileactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class alertactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertactivity)

        val button: Button = findViewById((R.id.button))

        button.setOnClickListener{

            val builder = AlertDialog.Builder(this)

            builder.setTitle("My Alert")
            builder.setMessage("Are you sure?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            //performing positive button
            builder.setPositiveButton("yes"){_,_ ->
                Toast.makeText(applicationContext, "clicked yes", Toast.LENGTH_LONG).show()

            }
            //performing neutral button **cancel
            builder.setNeutralButton("cancel"){_,_ ->
                Toast.makeText(applicationContext, "clicked cancel", Toast.LENGTH_LONG).show()
                
            }
            //performing negative button
            builder.setNegativeButton("no") {_,_->
                Toast.makeText(applicationContext, "clicked no", Toast.LENGTH_LONG).show()
            }

            val alertDialog : AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }


    }
}