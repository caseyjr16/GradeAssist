package com.example.gradeassist

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.gradeassist.ui.quiz_results.ShowHistoryQuiz
import com.example.gradeassist.ui.quiz_results.ShowGeographyQuiz
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

    fun viewGeographyQuiz(view: View) {
        val intent = Intent(applicationContext, ShowGeographyQuiz::class.java)
        startActivity(intent)
    }

    fun viewHistoryQuiz(view: View) {
        val intent = Intent(applicationContext, ShowHistoryQuiz::class.java)
        startActivity(intent)
    }

}
