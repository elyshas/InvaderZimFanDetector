package com.example.android.invaderzimfandetector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //***Calculate final score***
    int totalScore;

    //***+1 for correct answers***
    private static final int correctAnswer = 1;

    //***RadioButton Groups***
    private boolean question1AlreadyAnsweredCorrectly = false;
    private boolean question3AlreadyAnsweredCorrectly = false;
    private boolean question5AlreadyAnsweredCorrectly = false;
    private boolean question7AlreadyAnsweredCorrectly = false;

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
                if (button1Checked && !question1AlreadyAnsweredCorrectly) {
                    // CORRECT - Puffer fish and gnomes
                    totalScore += correctAnswer;
                    question1AlreadyAnsweredCorrectly = true;
                }
                break;
            case R.id.q1a2:
                if (button1Checked && question1AlreadyAnsweredCorrectly) {
                    // Squirrels and gnomes
                    if (totalScore > 0) {
                        totalScore -= correctAnswer;
                    }
                    question1AlreadyAnsweredCorrectly = false;
                }
                break;
        }
    }

    //*** Question 2 - GIR favorite food - checkboxes***
    public void onCheckboxes1Checked(View view) {
        // Is the Q2 checkboxes checked?
        boolean checkboxes1Checked = ((CheckBox) view).isChecked();
        // Check which button is checked and add/subtract points when appropriate
        switch (view.getId()) {
            case R.id.q2a1:
                if (checkboxes1Checked) {
                    // pizza
                    totalScore += correctAnswer;
                }
                break;
            case R.id.q2a2:
                if (checkboxes1Checked) {
                    // waffles
                    totalScore += correctAnswer;
                }
                break;
            case R.id.q2a3:
                if (checkboxes1Checked) {
                    // INCORRECT - peanuts
                    totalScore -= correctAnswer;
                }
                    break;
            case R.id.q2a4:
                if (checkboxes1Checked) {
                    // tacos
                    totalScore += correctAnswer;
                }
                break;
        }
    }

    //*** Question 3 - Zim's fake best friend - radio buttons***
    public void onRadioButton2Clicked(View view) {
        // Is the Q3 button now checked?
        boolean button2Checked = ((RadioButton) view).isChecked();
        // Check which button is checked and add/subtract points when appropriate
        switch (view.getId()) {
            case R.id.q3a1:
                if (button2Checked && question3AlreadyAnsweredCorrectly)
                    // Larry
                    if (totalScore > 0) {
                        totalScore -= correctAnswer;
                    }
                    question3AlreadyAnsweredCorrectly = false;
                    break;
            case R.id.q3a2:
                if (button2Checked && !question3AlreadyAnsweredCorrectly) {
                    // CORRECT - Keef
                    totalScore += correctAnswer;
                    question3AlreadyAnsweredCorrectly = true;
                }
                break;
            case R.id.q3a3:
                if (button2Checked && question3AlreadyAnsweredCorrectly) {
                    // Garry
                    if (totalScore > 0) {
                        totalScore -= correctAnswer;
                    }
                    question3AlreadyAnsweredCorrectly = false;
                }
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
                if (checkboxes2Checked) {
                    // Video Games
                    totalScore += correctAnswer;
                }
                break;
            case R.id.q4a2:
                if (checkboxes2Checked) {
                    // INCORRECT - Building robots
                    totalScore -= correctAnswer;
                }
                break;
            case R.id.q4a3:
                if (checkboxes2Checked) {
                    // Insulting Dib
                    totalScore += correctAnswer;
                }
                break;
        }
    }

    //*** Question 5 - Name of Zim's zit - radio buttons***
    public void onRadioButton3Clicked(View view) {
        // Is the Q1 button now checked?
        boolean button3Checked = ((RadioButton) view).isChecked();
        // Check which button is checked and add/subtract points when appropriate
        switch (view.getId()) {
            case R.id.q5a1:
                if (button3Checked && question5AlreadyAnsweredCorrectly) {
                    // Walton Chunky
                    if (totalScore > 0) {
                        totalScore -= correctAnswer;
                    }
                    question3AlreadyAnsweredCorrectly = false;
                }
                break;
            case R.id.q5a2:
                if (button3Checked && !question5AlreadyAnsweredCorrectly) {
                    // CORRECT - Pustulio
                    totalScore += correctAnswer;
                    question5AlreadyAnsweredCorrectly = true;
                }
                break;
            case R.id.q5a3:
                if (button3Checked && question5AlreadyAnsweredCorrectly) {
                    // Walton Chunky
                    if (totalScore > 0) {
                        totalScore -= correctAnswer;
                    }
                    question3AlreadyAnsweredCorrectly = false;
                }
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
                if (checkboxes3Checked) {
                    // INCORRECT - Squirrel Antics
                    totalScore -= correctAnswer;
                }
                break;
            case R.id.q6a2:
                if (checkboxes3Checked) {
                    // The Doom Song
                    totalScore += correctAnswer;
                }
                break;
            case R.id.q6a3:
                if (checkboxes3Checked) {
                    // Merry Jingly
                    totalScore += correctAnswer;
                }
                break;
        }
    }

       //*** Question 7 - Zim's horrible career day - radio buttons***
    public void onRadioButton4Clicked(View view) {
        // Is the Q7 button now checked?
        boolean button4Checked = ((RadioButton) view).isChecked();
        // Check which button is checked and add/subtract points when appropriate
        switch (view.getId()) {
            case R.id.q7a1:
                if (button4Checked && question7AlreadyAnsweredCorrectly) {
                    // Walton Chunky
                    if (totalScore > 0) {
                        totalScore -= correctAnswer;
                    }
                    question7AlreadyAnsweredCorrectly = false;
                }
                break;
            case R.id.q7a2:
                if (button4Checked && question7AlreadyAnsweredCorrectly) {
                    // Walton Chunky
                    if (totalScore > 0) {
                        totalScore -= correctAnswer;
                    }
                    question7AlreadyAnsweredCorrectly = false;
                }
                break;
            case R.id.q7a3:
                if (button4Checked && !question7AlreadyAnsweredCorrectly) {
                    // CORRECT - Pustulio
                    totalScore += correctAnswer;
                    question7AlreadyAnsweredCorrectly = true;
                }
                break;
        }
    }

//    //*** Question 8 - Irken Rulers - EditText question***

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
        //Reset QUESTION 8 EditText
//        answer8.setText("");

        //Resetting EditText
        userName.setText("");

        //Resetting quiz score
        totalScore = 0;
    }

}

