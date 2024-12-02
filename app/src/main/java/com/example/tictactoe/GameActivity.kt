package com.example.tictactoe

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.tictactoe.databinding.ActivityGameBinding
import com.example.tictactoe.databinding.ActivityMainBinding

class GameActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityGameBinding

    private var gameModel: GameModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn0.setOnClickListener(this)
        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)


        binding.startGameBtn.setOnClickListener {
            startGame()
        }

        GameData.gameModel.observe(this){
            gameModel = it
            setUI()
        }

    }

    fun setUI(){
        gameModel?.apply {
            binding.btn0.text = filledPos[0]
            binding.btn1.text = filledPos[1]
            binding.btn2.text = filledPos[2]
            binding.btn3.text = filledPos[3]
            binding.btn4.text = filledPos[4]
            binding.btn5.text = filledPos[5]
            binding.btn6.text = filledPos[6]
            binding.btn7.text = filledPos[7]
            binding.btn8.text = filledPos[8]


            binding.gameStatusText.text=
                when(gameStaus){
                    GameStatus.CREATED -> {"Game ID:"+gameId}
                    GameStatus.JOINED -> "Click on Start Game to begin"
                    GameStatus.INPROGRESS -> currentPlayer+"'s turn"
                    GameStatus.FINISHED -> if (winner.isNotEmpty()) "Winner is $winner" else "Game Draw"
                }
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_0 -> {
                // Handle click for btn_0
            }
            R.id.btn_1 -> {
                // Handle click for btn_1
            }
            R.id.btn_2 -> {
                // Handle click for btn_2
            }
            R.id.btn_3 -> {
                // Handle click for btn_3
            }
            R.id.btn_4 -> {
                // Handle click for btn_4
            }
            R.id.btn_5 -> {
                // Handle click for btn_5
            }
            R.id.btn_6 -> {
                // Handle click for btn_6
            }
            R.id.btn_7 -> {
                // Handle click for btn_7
            }
            R.id.btn_8 -> {
                // Handle click for btn_8
            }
            else -> {
                // Handle any other views if needed
            }
        }
    }

    // Start the game method (to be implemented)
    private fun startGame() {
        TODO("Not yet implemented")
    }
}
