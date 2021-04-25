package com.steve.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.contact -> Toast.makeText(this,"Contact",Toast.LENGTH_LONG).show()
            R.id.notification -> Toast.makeText(this,"Contact",Toast.LENGTH_LONG).show()
            R.id.download -> Toast.makeText(this,"Contact",Toast.LENGTH_LONG).show()
            R.id.sender-> Toast.makeText(this,"Contact",Toast.LENGTH_LONG).show()
            R.id.message-> Toast.makeText(this,"Contact",Toast.LENGTH_LONG).show()
        }
        return true
    }
}