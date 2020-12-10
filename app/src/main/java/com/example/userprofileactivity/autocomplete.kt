package com.example.userprofileactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class autocomplete : AppCompatActivity() {
    private val  language= arrayOf("Nepali", "Hindi","English", "Chinese")

    private lateinit  var autocomplete: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autocomplete)

        autocomplete = findViewById(R.id.autoComplete)

        //val auto
        val autoCompleteAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            language
        )
        autocomplete.setAdapter(autoCompleteAdapter)
        autocomplete.threshold=1


    }
}