package com.example.gametesterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.sql.Date
import java.time.LocalDate

class MainInputScreenActivity : AppCompatActivity() {
    private var dateTxt: EditText
    private var minutesTxt: EditText
    private var genreTxt: EditText
    private var ratingTxt: EditText
    private var addBtn: Button
    private var clearBtn: Button
    private var detailsBtn: Button

    private val date = mutableListOf<String>("2025-06-01", "2025-06-02", "2025-06-03","2025-06-04", "2025-06-05",
        "2025-06-08", "2025-06-10"
    )
    private val minutes = mutableListOf<Int>(45, 60, 20, 30, 25, 60, 52)
    private val genres = mutableListOf<String>("Puzzle", "Platformer", "Strategy", "DressUp", "Adventure", "Role-Play","Sports")
    private val rating = mutableListOf<Int>(4,5,3,2,6,4,1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_input_screen)
        // Input UI Elements here
        dateTxt = findViewById(R.id.dateTxt)
        minutesTxt = findViewById(R.id.minutesTxt)
        genreTxt = findViewById(R.id.genreTxt)
        ratingTxt = findViewById(R.id.ratingTxt)
        addBtn = findViewById(R.id.addBtn)
        clearBtn = findViewById(R.id.clearBtn)
        detailsBtn = findViewById(R.id.detailsBtn)

        // Set the add entry button here on click listener
        addBtn.setOnClickListener{
            date = intent.getStringArrayListExtra("date") ?: arrayListOf()
            minutes = intent.getIntegerArrayListExtra("minutes") ?: arrayListOf()
            genres = intent. getStringArrayListExtra("genres") ?: arrayListOf()
            rating = intent. getIntegerArrayListExtra("rating") ?: arrayListOf()






            }
        }


    }


