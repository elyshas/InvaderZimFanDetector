package com.example.android.invaderzimfandetector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //***Calculates final score***
    int totalScore;

    //***+1 for correct answers***
    private static final int CorrectAnswer = 1;

    //***Saving score for rotation***
    static final String GAME_SCORE = "gameScore";

    //***Referencing XML and linking***
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Attempting to save score upon rotation and oncreate
        if (savedInstanceState != null) {
            totalScore = savedInstanceState.getInt(GAME_SCORE);
            // Else, start at 0
        } else {
            totalScore = 0;
        }

    }

    // Calling on the label and adding the int value for user answers (which was created at the top).

    //*** Saving instance for when rotating between portrait and landscape***
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(GAME_SCORE, totalScore);
        // Call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    //*** Question 1 - Zim's house decor - radio buttons***
    public void onRadioButton1Clicked(View view) {
        // Is the Q1 button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();
        // Check which boxes are checked and add points when appropriate
        switch (view.getId()) {
            case R.id.q1a1:
                if (button1Checked)
                    // Puffer fish and gnomes
                    totalScore += CorrectAnswer;
                break;
            case R.id.q1a2:
                if (button1Checked)
                    // Squirrels and gnomes
                    break;
        }
    }

    //*** Question 2 - GIR favorite food - checkboxes***
    public void onCheckboxes1Checked(View view) {
        // Is the Q2 checkboxes checked?
        boolean checkboxes1Checked = ((CheckBox) view).isChecked();
        // Check which boxes are checked and add points when appropriate
        switch (view.getId()) {
            case R.id.q2a1:
                if (checkboxes1Checked)
                    // pizza
                    totalScore += CorrectAnswer;
                break;
            case R.id.q2a2:
                if (checkboxes1Checked)
                    // waffles
                    totalScore += CorrectAnswer;
                break;
            case R.id.q2a3:
                if (checkboxes1Checked)
                    // peanuts
                    totalScore -= CorrectAnswer;
                    break;
            case R.id.q2a4:
                if (checkboxes1Checked)
                    // tacos
                    totalScore += CorrectAnswer;
                break;
        }
    }

    //*** Question 3 - Zim's fake best friend - radio buttons***
    public void onRadioButton2Clicked(View view) {
        // Is the Q3 button now checked?
        boolean button2Checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q3a1:
                if (button2Checked)
                    // Larry
                    break;
            case R.id.q3a2:
                if (button2Checked)
                    // Keef
                    totalScore += CorrectAnswer;
                break;
            case R.id.q3a3:
                if (button2Checked)
                    // Garry
                    break;
        }
    }

    //*** Question 4 - Gaz's favorite things - checkboxes***
    public void onCheckboxes2Checked(View view) {
        // Is the Q4 checkboxes checked?
        boolean checkboxes2Checked = ((CheckBox) view).isChecked();
        // Check which boxes are checked and add points when appropriate
        switch (view.getId()) {
            case R.id.q4a1:
                if (checkboxes2Checked)
                    // Video Games
                    totalScore += CorrectAnswer;
                break;
            case R.id.q4a2:
                if (checkboxes2Checked)
                    // Building robots
                    totalScore -= CorrectAnswer;
                    break;
            case R.id.q4a3:
                if (checkboxes2Checked)
                    // Insulting Dib
                    totalScore += CorrectAnswer;
                break;
        }
    }

    //*** Question 5 - Name of Zim's zit - radio buttons***
    public void onRadioButton3Clicked(View view) {
        // Is the Q1 button now checked?
        boolean button3Checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q5a1:
                if (button3Checked)
                    // Walton Chunky
                    break;
            case R.id.q5a2:
                if (button3Checked)
                    // Pustulio
                    totalScore += CorrectAnswer;
                break;
            case R.id.q5a3:
                if (button3Checked)
                    // Zitboy
                    break;
        }
    }

    //*** Question 6 - GIR's best songs - checkboxes***
    public void onCheckboxes3Checked(View view) {
        // Is the Q6 checkboxes checked?
        boolean checkboxes3Checked = ((CheckBox) view).isChecked();
        // Check which boxes are checked and add points when appropriate
        switch (view.getId()) {
            case R.id.q6a1:
                if (checkboxes3Checked)
                    // Squirrel Antics
                    totalScore -= CorrectAnswer;
                    break;
            case R.id.q6a2:
                if (checkboxes3Checked)
                    // The Doom Song
                    totalScore += CorrectAnswer;
                break;
            case R.id.q6a3:
                if (checkboxes3Checked)
                    // Merry Jingly
                    totalScore += CorrectAnswer;
                break;
        }
    }

       //*** Question 7 - Zim's horrible career day - radio buttons***
    public void onRadioButton4Clicked(View view) {
        // Is the Q7 button now checked?
        boolean button4Checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q7a1:
                if (button4Checked)
                    // Burger Slave
                    break;
            case R.id.q7a2:
                if (button4Checked)
                    // McBunsALot
                    break;
            case R.id.q7a3:
                if (button4Checked)
                    // McMeaties
                    totalScore += CorrectAnswer;
                break;
        }
    }

//    //*** Question 8 - Irken Rulers - EditText question***
//    public void answer8Completed (View view) {
//        // Is the Q8 answered?
//
//        // Check answer
//
//        // correct answer
//
//        //incorrect answer (if needed)
//    }

    //***Calculate user total score and display proper response based on their score***
    public void displayScore(View view) {
        EditText userName = (EditText) findViewById(R.id.userName);
        String name = userName.getText().toString();
        if (totalScore >= 9) {
            Toast.makeText(this, "Congratulations " + name + ", I'll let you live... FOR NOW!", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Your acceptable score was: " + totalScore, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Stupid " + name + ", you must now suffer my wrath of DOOM!", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Your pitiful score was: " + totalScore, Toast.LENGTH_LONG).show();
        }

        //***Resetting all quiz questions after submit button is selected***
        //Resetting RadioButtons
        //QUESTION 1
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.q1a1);
        radioButton1.setChecked(false);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.q1a2);
        radioButton2.setChecked(false);
        //QUESTION 3
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.q3a1);
        radioButton3.setChecked(false);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.q3a2);
        radioButton4.setChecked(false);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.q3a3);
        radioButton5.setChecked(false);
        //QUESTION 5
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.q5a1);
        radioButton6.setChecked(false);
        RadioButton radioButton7 = (RadioButton) findViewById(R.id.q5a2);
        radioButton7.setChecked(false);
        RadioButton radioButton8 = (RadioButton) findViewById(R.id.q5a3);
        radioButton8.setChecked(false);
        //QUESTION 7
        RadioButton radioButton9 = (RadioButton) findViewById(R.id.q7a1);
        radioButton9.setChecked(false);
        RadioButton radioButton10 = (RadioButton) findViewById(R.id.q7a2);
        radioButton10.setChecked(false);
        RadioButton radioButton11 = (RadioButton) findViewById(R.id.q7a3);
        radioButton11.setChecked(false);

        //Resetting CheckBoxes
        //QUESTION 2
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.q2a1);
        checkBox1.setChecked(false);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.q2a2);
        checkBox2.setChecked(false);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.q2a3);
        checkBox3.setChecked(false);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.q2a4);
        checkBox4.setChecked(false);
        //QUESTION 4
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.q4a1);
        checkBox5.setChecked(false);
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.q4a2);
        checkBox6.setChecked(false);
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.q4a3);
        checkBox7.setChecked(false);
        //QUESTION 6
        CheckBox checkBox8 = (CheckBox) findViewById(R.id.q6a1);
        checkBox8.setChecked(false);
        CheckBox checkBox9 = (CheckBox) findViewById(R.id.q6a2);
        checkBox9.setChecked(false);
        CheckBox checkBox10 = (CheckBox) findViewById(R.id.q6a3);
        checkBox10.setChecked(false);

        //Resetting EditText
        userName.setText("");

        //Resetting quiz score
        totalScore = 0;
    }

}

