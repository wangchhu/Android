package com.example.userprofileactivity

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.util.*

class datepicker : AppCompatActivity() {

    private lateinit var btncalender : Button
    private lateinit var tvdate : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datepicker)

        btncalender =findViewById(R.id.btncalender)
        tvdate= findViewById(R.id.tvdate)

        btncalender.setOnClickListener{
            loadCalender()
        }

        }

    fun loadCalender(){
        val c=Calendar.getInstance()
        val year=c.get(Calendar.YEAR)
        val month =c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datepickerDialog =DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener{ view, year, monthofYear, dayOfMonth ->
                tvdate.text ="Selected Date : $dayOfMonth/${monthofYear+1}/ $year"

            },
            year,
            month,
            day
        )
        datepickerDialog.show()
    }
}