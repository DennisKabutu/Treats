package com.example.treats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setup navigation on the Bottom Nav Bar
        // Initialize the Bottom Nav Bar using the findViewById
        val bottomNavBar = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        //Initialize Nav controller using the findNavController
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        // Merge the controller and Bottom navbar view with setupWithController method
        bottomNavBar.setupWithNavController(navController)

    }
}