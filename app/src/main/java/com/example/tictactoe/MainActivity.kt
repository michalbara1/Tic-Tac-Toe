package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        binding.playBtn.setOnClickListener {
            createGame()
        }
    }
    fun createGame(){
        GameData.saveGameModel(GameModel(gameStatus = GameStatus.JOINED))
        startGame()
    }

    fun startGame() {
        startActivity(Intent(this,GameActivity::class.java))
    }

}
