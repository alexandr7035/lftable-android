package com.alexandr7035.lftable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val LOG_TAG = "DEBUG_TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(LOG_TAG, "app started")

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.action_notifications -> {
                    Log.d(LOG_TAG, "ITEM: notifications")
                    // Respond to navigation item 1 click
                    true
                }
                R.id.action_timetables -> {
                    Log.d(LOG_TAG, "ITEM: timetables")
                    // Respond to navigation item 2 click
                    true
                }

                R.id.action_settings -> {
                    Log.d(LOG_TAG, "ITEM: settings")
                    // Respond to navigation item 2 click
                    true
                }

                else -> false
            }

        }
    }
}