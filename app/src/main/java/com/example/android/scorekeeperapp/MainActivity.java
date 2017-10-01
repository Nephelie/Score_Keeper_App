package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreHome = 0;
    int scoreGuest = 0;
    int redCardHome = 0;
    int redCardGuest = 0;
    int yellowCardHome = 0;
    int yellowCardGuest = 0;
    int foulHome = 0;
    int foulGuest = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays Home's score.
     *
     * @param score for Home team.
     */
    public void displayHomeScore(int score) {
        TextView scoreHName = (TextView) findViewById(R.id.home_score);
        scoreHName.setText(String.valueOf(score));
    }

    /**
     * Adds a goal to Home team.
     */
    public void goal_home(View v) {
        scoreHome += 1;
        displayHomeScore(scoreHome);

        //Show a message as a Toast.
        Toast toast = Toast.makeText(this, R.string.GOAAAAAAAALLLLLL, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    /**
     * Displays Guest's score.
     *
     * @param score for Guest team.
     */
    public void displayGuestScore(int score) {
        TextView scoreGName = (TextView) findViewById(R.id.guest_score);
        scoreGName.setText(String.valueOf(score));
    }

    /**
     * Adds a goal to Guest team.
     */
    public void goal_guest(View v) {
        scoreGuest += 1;
        displayGuestScore(scoreGuest);
    }

    /**
     * Displays the number of red cards of Home team.
     *
     * @param redCard for Home team.
     */
    public void displayRedCardsH(int redCard) {
        TextView redCardHome = (TextView) findViewById(R.id.red_Card_Home);
        redCardHome.setText(String.valueOf(redCard));
    }

    /**
     * Adds a red card to Home team.
     */
    public void red_card_home(View v) {
        redCardHome += 1;
        displayRedCardsH(redCardHome);
    }

    /**
     * Displays the number of red cards of Guest team.
     *
     * @param redCard for Guest team.
     */
    public void displayRedCardsG(int redCard) {
        TextView redCardGuest = (TextView) findViewById(R.id.red_Card_Guest);
        redCardGuest.setText(String.valueOf(redCard));
    }

    /**
     * Adds a red card to Guest team.
     */
    public void red_card_guest(View v) {
        redCardGuest += 1;
        displayRedCardsG(redCardGuest);
    }

    /**
     * Displays the number of yellow cards of Home team.
     *
     * @param yellowCard for Home team.
     */
    public void displayYellowCardsH(int yellowCard) {
        TextView yellowCardHome = (TextView) findViewById(R.id.yellow_Card_Home);
        yellowCardHome.setText(String.valueOf(yellowCard));
    }

    /**
     * Adds a yellow card to Home team.
     */
    public void yellow_card_home(View v) {
        yellowCardHome += 1;
        displayYellowCardsH(yellowCardHome);
    }

    /**
     * Displays the number of yellow cards of Guest team.
     *
     * @param yellowCard for Guest team.
     */
    public void displayYellowCardsG(int yellowCard) {
        TextView yellowCardGuest = (TextView) findViewById(R.id.yellow_Card_Guest);
        yellowCardGuest.setText(String.valueOf(yellowCard));
    }

    /**
     * Adds a yellow card to Guest team.
     */
    public void yellow_card_guest(View v) {
        yellowCardGuest += 1;
        displayYellowCardsG(yellowCardGuest);
    }

    /**
     * Displays the number of fouls of Home team.
     *
     * @param foul of Home team.
     */
    public void displayFoulH(int foul) {
        TextView foulHome = (TextView) findViewById(R.id.foul_Home);
        foulHome.setText(String.valueOf(foul));
    }

    /**
     * Adds a foul to Home team.
     */
    public void foul_home(View v) {
        foulHome += 1;
        displayFoulH(foulHome);
    }

    /**
     * Displays the number of fouls of Guest team.
     *
     * @param foul of Guest team.
     */
    public void displayFoulG(int foul) {
        TextView foulGuest = (TextView) findViewById(R.id.foul_Guest);
        foulGuest.setText(String.valueOf(foul));
    }

    /**
     * Adds a foul to Guest team.
     */
    public void foul_guest(View v) {
        foulGuest += 1;
        displayFoulG(foulGuest);
    }

    /**
     * Resets the scores,the red cards,the yellow cards and the fouls to zero.
     */
    public void reset(View v) {
        scoreHome = 0;
        scoreGuest = 0;
        redCardHome = 0;
        redCardGuest = 0;
        yellowCardHome = 0;
        yellowCardGuest = 0;
        foulHome = 0;
        foulGuest = 0;
        displayHomeScore(scoreHome);
        displayGuestScore(scoreGuest);
        displayRedCardsH(redCardHome);
        displayRedCardsG(redCardGuest);
        displayYellowCardsH(yellowCardHome);
        displayYellowCardsG(yellowCardGuest);
        displayFoulH(foulHome);
        displayFoulG(foulGuest);
    }
}

