package com.example.truthordrink

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Draw Function
        val drawButton: Button = findViewById(R.id.draw_button)
        val rulesButton: Button = findViewById(R.id.rules_Button)
        val endGame: Button = findViewById(R.id.end_game)
        val cardDisplay: CardView = findViewById(R.id.card_view)
        val closeRulesButton: Button = findViewById(R.id.close_rules_button)
        val rulesView: CardView = findViewById(R.id.rules_view)
        val decksLayout: LinearLayout = findViewById(R.id.decks_layout)
        rulesButton.setOnClickListener{
            rulesView.visibility = View.VISIBLE
            drawButton.visibility = View.GONE
            rulesButton.visibility = View.GONE
            decksLayout.visibility = View.GONE

        }
        closeRulesButton.setOnClickListener{
            rulesView.visibility = View.GONE
            drawButton.visibility = View.VISIBLE
            rulesButton.visibility = View.VISIBLE
            decksLayout.visibility = View.VISIBLE
        }
        drawButton.setOnClickListener {
            val image: ImageView = findViewById(R.id.active_card)


            //Build The Deck
            val onTheRocksDeck = arrayOf(
                R.drawable.on_the_rocks_1,
                R.drawable.on_the_rocks_2,
                R.drawable.on_the_rocks_3,
                R.drawable.on_the_rocks_4,
                R.drawable.on_the_rocks_5,
                R.drawable.on_the_rocks_6,
                R.drawable.on_the_rocks_7,
                R.drawable.on_the_rocks_8,
                R.drawable.on_the_rocks_9,
                R.drawable.on_the_rocks_10,
                R.drawable.on_the_rocks_11,
                R.drawable.on_the_rocks_12,
                R.drawable.on_the_rocks_13,
                R.drawable.on_the_rocks_14,
                R.drawable.on_the_rocks_15,
                R.drawable.on_the_rocks_16,
                R.drawable.on_the_rocks_17,
                R.drawable.on_the_rocks_18,
                R.drawable.on_the_rocks_19,
                R.drawable.on_the_rocks_20,
                R.drawable.on_the_rocks_21,
                R.drawable.on_the_rocks_22,
                R.drawable.on_the_rocks_23,
                R.drawable.on_the_rocks_24,
                R.drawable.on_the_rocks_25,
                R.drawable.on_the_rocks_26,
                R.drawable.on_the_rocks_27,
                R.drawable.on_the_rocks_28,
                R.drawable.on_the_rocks_29,
                R.drawable.on_the_rocks_30,
                R.drawable.on_the_rocks_31,
                R.drawable.on_the_rocks_32,
                R.drawable.on_the_rocks_33,
                R.drawable.on_the_rocks_34,
                R.drawable.on_the_rocks_35,
                R.drawable.on_the_rocks_36,
                R.drawable.on_the_rocks_37,
                R.drawable.on_the_rocks_38,
                R.drawable.on_the_rocks_39,
                R.drawable.on_the_rocks_40,
                R.drawable.on_the_rocks_41,
                R.drawable.on_the_rocks_42,
                R.drawable.on_the_rocks_43,
                R.drawable.on_the_rocks_44,
                R.drawable.on_the_rocks_45,
                R.drawable.on_the_rocks_46,
                R.drawable.on_the_rocks_47,
                R.drawable.on_the_rocks_48,
                R.drawable.on_the_rocks_49,
                R.drawable.on_the_rocks_50,
                R.drawable.on_the_rocks_51,
                R.drawable.on_the_rocks_52,
                R.drawable.on_the_rocks_53,
                R.drawable.on_the_rocks_54,
                R.drawable.on_the_rocks_55
            )
            val happyHourDeck = arrayOf(
                R.drawable.happy_hour_1,
                R.drawable.happy_hour_2,
                R.drawable.happy_hour_3,
                R.drawable.happy_hour_4,
                R.drawable.happy_hour_5,
                R.drawable.happy_hour_6,
                R.drawable.happy_hour_7,
                R.drawable.happy_hour_8,
                R.drawable.happy_hour_9,
                R.drawable.happy_hour_10,
                R.drawable.happy_hour_11,
                R.drawable.happy_hour_12,
                R.drawable.happy_hour_13,
                R.drawable.happy_hour_14,
                R.drawable.happy_hour_15,
                R.drawable.happy_hour_16,
                R.drawable.happy_hour_17,
                R.drawable.happy_hour_18,
                R.drawable.happy_hour_19,
                R.drawable.happy_hour_20,
                R.drawable.happy_hour_21,
                R.drawable.happy_hour_22,
                R.drawable.happy_hour_23,
                R.drawable.happy_hour_24,
                R.drawable.happy_hour_25,
                R.drawable.happy_hour_26,
                R.drawable.happy_hour_27,
                R.drawable.happy_hour_28,
                R.drawable.happy_hour_29,
                R.drawable.happy_hour_30,
                R.drawable.happy_hour_31,
                R.drawable.happy_hour_32,
                R.drawable.happy_hour_33,
                R.drawable.happy_hour_34,
                R.drawable.happy_hour_35,
                R.drawable.happy_hour_36,
                R.drawable.happy_hour_37,
                R.drawable.happy_hour_38,
                R.drawable.happy_hour_39,
                R.drawable.happy_hour_40,
                R.drawable.happy_hour_41,
                R.drawable.happy_hour_42,
                R.drawable.happy_hour_43,
                R.drawable.happy_hour_44,
                R.drawable.happy_hour_45,
                R.drawable.happy_hour_46,
                R.drawable.happy_hour_47,
                R.drawable.happy_hour_48,
                R.drawable.happy_hour_49,
                R.drawable.happy_hour_50,
                R.drawable.happy_hour_51,
                R.drawable.happy_hour_53,
                R.drawable.happy_hour_54,
                R.drawable.happy_hour_55
            )
            val lastCallDeck = arrayOf(
                R.drawable.last_call_1,
                R.drawable.last_call_2,
                R.drawable.last_call_3,
                R.drawable.last_call_4,
                R.drawable.last_call_5,
                R.drawable.last_call_6,
                R.drawable.last_call_7,
                R.drawable.last_call_8,
                R.drawable.last_call_9,
                R.drawable.last_call_10,
                R.drawable.last_call_11,
                R.drawable.last_call_12,
                R.drawable.last_call_13,
                R.drawable.last_call_14,
                R.drawable.last_call_15,
                R.drawable.last_call_16,
                R.drawable.last_call_17,
                R.drawable.last_call_18,
                R.drawable.last_call_19,
                R.drawable.last_call_20,
                R.drawable.last_call_21,
                R.drawable.last_call_22,
                R.drawable.last_call_23,
                R.drawable.last_call_24,
                R.drawable.last_call_25,
                R.drawable.last_call_26,
                R.drawable.last_call_27,
                R.drawable.last_call_28,
                R.drawable.last_call_29,
                R.drawable.last_call_30,
                R.drawable.last_call_31,
                R.drawable.last_call_32,
                R.drawable.last_call_33,
                R.drawable.last_call_34,
                R.drawable.last_call_35,
                R.drawable.last_call_36,
                R.drawable.last_call_37,
                R.drawable.last_call_38,
                R.drawable.last_call_39,
                R.drawable.last_call_40,
                R.drawable.last_call_41,
                R.drawable.last_call_42,
                R.drawable.last_call_43,
                R.drawable.last_call_44,
                R.drawable.last_call_45,
                R.drawable.last_call_46,
                R.drawable.last_call_47,
                R.drawable.last_call_48,
                R.drawable.last_call_49,
                R.drawable.last_call_50,
                R.drawable.last_call_51,
                R.drawable.last_call_52,
                R.drawable.last_call_53,
                R.drawable.last_call_54
            )
            val extraDirtyDeck = arrayOf(
                R.drawable.extra_dirty_1,
                R.drawable.extra_dirty_2,
                R.drawable.extra_dirty_3,
                R.drawable.extra_dirty_4,
                R.drawable.extra_dirty_5,
                R.drawable.extra_dirty_6,
                R.drawable.extra_dirty_7,
                R.drawable.extra_dirty_8,
                R.drawable.extra_dirty_9,
                R.drawable.extra_dirty_10,
                R.drawable.extra_dirty_11,
                R.drawable.extra_dirty_12,
                R.drawable.extra_dirty_13,
                R.drawable.extra_dirty_14,
                R.drawable.extra_dirty_15,
                R.drawable.extra_dirty_16,
                R.drawable.extra_dirty_17,
                R.drawable.extra_dirty_18,
                R.drawable.extra_dirty_19,
                R.drawable.extra_dirty_20,
                R.drawable.extra_dirty_21,
                R.drawable.extra_dirty_22,
                R.drawable.extra_dirty_23,
                R.drawable.extra_dirty_24,
                R.drawable.extra_dirty_25,
                R.drawable.extra_dirty_26,
                R.drawable.extra_dirty_27,
                R.drawable.extra_dirty_28,
                R.drawable.extra_dirty_29,
                R.drawable.extra_dirty_30,
                R.drawable.extra_dirty_31,
                R.drawable.extra_dirty_32,
                R.drawable.extra_dirty_33,
                R.drawable.extra_dirty_34,
                R.drawable.extra_dirty_35,
                R.drawable.extra_dirty_36,
                R.drawable.extra_dirty_37,
                R.drawable.extra_dirty_38,
                R.drawable.extra_dirty_39,
                R.drawable.extra_dirty_40,
                R.drawable.extra_dirty_41,
                R.drawable.extra_dirty_42,
                R.drawable.extra_dirty_43,
                R.drawable.extra_dirty_44,
                R.drawable.extra_dirty_45,
                R.drawable.extra_dirty_46,
                R.drawable.extra_dirty_47,
                R.drawable.extra_dirty_48,
                R.drawable.extra_dirty_49,
                R.drawable.extra_dirty_50,
                R.drawable.extra_dirty_51,
                R.drawable.extra_dirty_52,
                R.drawable.extra_dirty_53,
                R.drawable.extra_dirty_54
            )
            val withATwistDeck = arrayOf(
                R.drawable.with_a_twist_1,
                R.drawable.with_a_twist_2,
                R.drawable.with_a_twist_3,
                R.drawable.with_a_twist_4,
                R.drawable.with_a_twist_5,
                R.drawable.with_a_twist_6,
                R.drawable.with_a_twist_7,
                R.drawable.with_a_twist_8,
                R.drawable.with_a_twist_9,
                R.drawable.with_a_twist_10,
                R.drawable.with_a_twist_12,
                R.drawable.with_a_twist_13,
                R.drawable.with_a_twist_14,
                R.drawable.with_a_twist_15,
                R.drawable.with_a_twist_16,
                R.drawable.with_a_twist_17,
                R.drawable.with_a_twist_18,
                R.drawable.with_a_twist_19,
                R.drawable.with_a_twist_20,
                R.drawable.with_a_twist_21,
                R.drawable.with_a_twist_22,
                R.drawable.with_a_twist_23,
                R.drawable.with_a_twist_24,
                R.drawable.with_a_twist_25,
                R.drawable.with_a_twist_26,
                R.drawable.with_a_twist_27,
                R.drawable.with_a_twist_28,
                R.drawable.with_a_twist_29,
                R.drawable.with_a_twist_30,
                R.drawable.with_a_twist_31,
                R.drawable.with_a_twist_32,
                R.drawable.with_a_twist_33,
                R.drawable.with_a_twist_34,
                R.drawable.with_a_twist_35,
                R.drawable.with_a_twist_36,
                R.drawable.with_a_twist_37,
                R.drawable.with_a_twist_38,
                R.drawable.with_a_twist_39,
                R.drawable.with_a_twist_40,
                R.drawable.with_a_twist_41,
                R.drawable.with_a_twist_42,
                R.drawable.with_a_twist_43,
                R.drawable.with_a_twist_44,
                R.drawable.with_a_twist_45,
                R.drawable.with_a_twist_46,
                R.drawable.with_a_twist_47,
                R.drawable.with_a_twist_48,
                R.drawable.with_a_twist_49,
                R.drawable.with_a_twist_50,
                R.drawable.with_a_twist_51,
                R.drawable.with_a_twist_52,
                R.drawable.with_a_twist_53,
                R.drawable.with_a_twist_54
            )

            var activeDeck = emptyArray<Int>()

            val redCheckBox: CheckBox = findViewById(R.id.redCheckBox)
            val blackCheckBox: CheckBox = findViewById(R.id.blackCheckBox)
            val yellowCheckBox: CheckBox = findViewById(R.id.yellowCheckBox)
            val blueCheckBox: CheckBox = findViewById(R.id.blueCheckBox)

            if (redCheckBox.isChecked) {
                activeDeck += extraDirtyDeck
            }
            if (blueCheckBox.isChecked) {
                activeDeck += onTheRocksDeck
            }
            if (yellowCheckBox.isChecked) {
                activeDeck += happyHourDeck
            }
            if (blackCheckBox.isChecked) {
                activeDeck += lastCallDeck
            }


            //Start Game Function
            if (activeDeck.isNotEmpty()) {
                val n = Random.nextInt(activeDeck.size)
                image.setImageResource(activeDeck[n])

                //Make CardView Visible
                if (cardDisplay.visibility == View.GONE) {
                    cardDisplay.visibility = View.VISIBLE
                    drawButton.visibility = View.GONE
                    rulesButton.visibility = View.GONE
                    decksLayout.visibility = View.GONE

                }
            } else {
                Toast.makeText(this, "Add a Deck Dumbass", Toast.LENGTH_SHORT).show()
            }

        }


        //Player Score Function
        val playerOneScoreDisplay: TextView = findViewById(R.id.player_one_score)
        val playerTwoScoreDisplay: TextView = findViewById(R.id.player_two_score)
        val playerOneTurnMarker: TextView = findViewById(R.id.player_one_turn_marker)
        val playerTwoTurnMarker: TextView = findViewById(R.id.player_two_turn_marker)
        var playerOneScore = 0
        var playerTwoScore = 0

        //Tell The Truth Function
        val truthButton: Button = findViewById(R.id.truth_button)

        truthButton.setOnClickListener {
            drawButton.callOnClick()
            if (playerOneTurnMarker.isVisible) {
                playerOneTurnMarker.visibility = View.INVISIBLE
                playerTwoTurnMarker.visibility = View.VISIBLE
            } else if (playerTwoTurnMarker.isVisible) {
                playerOneTurnMarker.visibility = View.VISIBLE
                playerTwoTurnMarker.visibility = View.INVISIBLE
            }
        }


        //Take A Drink Function
        val drinkButton: Button = findViewById(R.id.drink_button)
        drinkButton.setOnClickListener {
            drawButton.callOnClick()
            if (playerOneTurnMarker.isVisible) {
                playerOneScore += 1
                playerOneScoreDisplay.setText("Drinks: $playerOneScore")
                playerOneTurnMarker.visibility = View.INVISIBLE
                playerTwoTurnMarker.visibility = View.VISIBLE
            } else if (playerTwoTurnMarker.isVisible) {
                playerTwoScore += 1
                playerTwoScoreDisplay.setText("Drinks: $playerTwoScore")
                playerOneTurnMarker.visibility = View.VISIBLE
                playerTwoTurnMarker.visibility = View.INVISIBLE
            }
            if (playerOneScore > 4 || playerTwoScore > 4) {
                endGame.callOnClick()
                Toast.makeText(
                    this,
                    "That's enough drinking for now, how about some water?",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        //End Game Function
        endGame.setOnClickListener {
            playerOneScore = 0
            playerTwoScore = 0
            playerOneScoreDisplay.setText("Drinks: $playerOneScore")
            playerTwoScoreDisplay.setText("Drinks: $playerTwoScore")
            cardDisplay.visibility = View.GONE
            drawButton.visibility = View.VISIBLE
            rulesButton.visibility = View.VISIBLE
            decksLayout.visibility = View.VISIBLE

        }

    }

}