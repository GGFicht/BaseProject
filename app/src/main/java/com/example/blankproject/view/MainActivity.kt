package com.example.blankproject.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.blankproject.R
import com.example.blankproject.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity(R.layout.activity_main) {

    private val navController: NavController by lazy {
        findNavController(R.id.nav_host_fragment)
    }

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
    }
}