
package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        fun createBirthdayCard(view: View) {
      val name= nameinput.editableText.toString()

        val Intent= Intent(this,BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)





    }
}
