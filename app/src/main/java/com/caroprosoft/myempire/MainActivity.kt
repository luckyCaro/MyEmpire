package com.caroprosoft.myempire

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var buttonHome: ImageView
    lateinit var buttonEconomic: ImageView
    lateinit var buttonResearch: ImageView
    lateinit var buttonArmy: ImageView
    lateinit var buttonWorld: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        init()
    }

    fun init() {
        supportFragmentManager.beginTransaction().replace(R.id.place_holder, HomeFragment.newInstance()).commit()
        buttonHome = findViewById(R.id.button_home)
        buttonEconomic = findViewById(R.id.button_economic)
        buttonResearch = findViewById(R.id.button_research)
        buttonArmy = findViewById(R.id.button_army)
        buttonWorld = findViewById(R.id.button_world)
        buttonHome.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.place_holder, HomeFragment.newInstance()).commit()
        }
        buttonEconomic.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.place_holder, EconomicFragment.newInstance()).commit()
        }
        buttonResearch.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.place_holder, ResearchFragment.newInstance()).commit()
        }
        buttonArmy.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.place_holder, ArmyFragment.newInstance()).commit()
        }
        buttonWorld.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.place_holder, WorldFragment.newInstance()).commit()
        }
    }

    fun initStartCountry() {
    }
}