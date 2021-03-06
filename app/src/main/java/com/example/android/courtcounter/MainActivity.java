package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Changes score when 3 point button is pressed
     */
    public void threePoints(View view) {
        switch (view.getId()) {
            case R.id.team_a_three:
                scoreTeamA += 3;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.team_b_three:
                scoreTeamB += 3;
                displayForTeamB(scoreTeamB);
                break;
            default:
                break;
        }

    }

    /**
     * Changes score when 2 point button is pressed
     */
    public void twoPoints(View view) {
        switch (view.getId()) {
            case R.id.team_a_two:
                scoreTeamA += 2;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.team_b_two:
                scoreTeamB += 2;
                displayForTeamB(scoreTeamB);
                break;
            default:
                break;
        }
    }

    /**
     * Changes score when free throw button is pressed
     */
    public void freeThrow(View view) {
        switch (view.getId()) {
            case R.id.team_a_free:
                scoreTeamA++;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.team_b_free:
                scoreTeamB++;
                displayForTeamB(scoreTeamB);
                break;
            default:
                break;
        }
    }

    /**
     * Reset both scores to zero
     */

    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
