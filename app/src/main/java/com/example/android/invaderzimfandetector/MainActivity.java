package com.example.android.invaderzimfandetector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
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
        } System.out.println("Score after question 1: " + totalScore);
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
                    // Waffles
                    totalScore += correctAnswer;
                }
                break;
            case R.id.q2a3:
                if (checkboxes1Checked) {
                    // INCORRECT - peanuts
                    if (totalScore > 0) {
                        totalScore -= correctAnswer;
                    }
                }
                break;
            case R.id.q2a4:
                if (checkboxes1Checked) {
                    // Waffles
                    totalScore += correctAnswer;
                }
                break;
        } System.out.println("Score after question 2: " + totalScore);
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
        } System.out.println("Score after question 3: " + totalScore);
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
                    if (totalScore > 0) {
                        // INCORRECT - Building robots
                        totalScore -= correctAnswer;
                    }
                }
                break;
            case R.id.q4a3:
                if (checkboxes2Checked) {
                    // Insulting Dib
                    totalScore += correctAnswer;
                }
                break;
        } System.out.println("Score after question 4: " + totalScore);
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
        } System.out.println("Score after question 5: " + totalScore);
    }

    //*** Question 6 - GIR's best songs - checkboxes***
    public void onCheckboxes3Checked(View view) {
        // Is the Q6 checkboxes checked?
        boolean checkboxes3Checked = ((CheckBox) view).isChecked();
        // Check which boxes are checked and add points when appropriate
        switch (view.getId()) {
            case R.id.q6a1:
                if (checkboxes3Checked) {
                    if (totalScore > 0) {
                        // INCORRECT - Squirrelzee
                        totalScore -= correctAnswer;
                    }
                }
                break;
            case R.id.q6a2:
                if (checkboxes3Checked) {
                    // Merry Jingly
                    totalScore += correctAnswer;
                }
                break;
            case R.id.q6a3:
                if (checkboxes3Checked) {
                    // The Doom Song
                    totalScore += correctAnswer;
                }
                break;
        } System.out.println("Score after question 6: " + totalScore);
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
        } System.out.println("Score after question 7: " + totalScore);
    }

    //*** Question 8 - Irken Rulers - EditText question***
    public void storeEighthAnswer() {
        EditText answer8 = findViewById(R.id.answer8);
        String answerNumber8 = answer8.getText().toString();
        // Is the Q8 answered?

      // Check answer & add +1 if correct
        if (answerNumber8.equals("2")) {
            totalScore += correctAnswer;
        }
        System.out.println("Score after question 8: " + totalScore);
    }

    //***Calculate user total score and display proper response based on their score***
    public void displayScore(View view) {
        //including eighth answer when submit is pushed
        storeEighthAnswer();

        EditText userName = findViewById(R.id.userName);
        String name = userName.getText().toString();
        if (totalScore >= 9) {
            Toast.makeText(this, "Congratulations " + name + ", I'll let you live... FOR NOW!", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Your acceptable score was: " + totalScore, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Stupid " + name + ", you must now suffer my wrath of DOOM!", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Your pitiful score was: " + totalScore, Toast.LENGTH_LONG).show();
        }

        //***Resetting all quiz questions after submit button is selected***

        //Resetting all RadioGroups
        //QUESTION 1 - First RB
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup1.clearCheck();
        //QUESTION 3 - Second RB
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup2.clearCheck();
        //QUESTION 5 - Third RB
        RadioGroup radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup3.clearCheck();
        //QUESTION 7 - Fourth RB
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup4.clearCheck();

        //Resetting RadioButton booleans
        question1AlreadyAnsweredCorrectly = false;
        question3AlreadyAnsweredCorrectly = false;
        question5AlreadyAnsweredCorrectly = false;
        question7AlreadyAnsweredCorrectly = false;

        //Resetting CheckBoxes
        //QUESTION 2
        CheckBox checkBox1 = findViewById(R.id.q2a1);
        checkBox1.setChecked(false);
        CheckBox checkBox2 = findViewById(R.id.q2a2);
        checkBox2.setChecked(false);
        CheckBox checkBox3 = findViewById(R.id.q2a3);
        checkBox3.setChecked(false);
        CheckBox checkBox4 = findViewById(R.id.q2a4);
        checkBox4.setChecked(false);
        //QUESTION 4
        CheckBox checkBox5 = findViewById(R.id.q4a1);
        checkBox5.setChecked(false);
        CheckBox checkBox6 = findViewById(R.id.q4a2);
        checkBox6.setChecked(false);
        CheckBox checkBox7 = findViewById(R.id.q4a3);
        checkBox7.setChecked(false);
        //QUESTION 6
        CheckBox checkBox8 = findViewById(R.id.q6a1);
        checkBox8.setChecked(false);
        CheckBox checkBox9 = findViewById(R.id.q6a2);
        checkBox9.setChecked(false);
        CheckBox checkBox10 = findViewById(R.id.q6a3);
        checkBox10.setChecked(false);
        //Reset QUESTION 8 EditText
        EditText answer8 = findViewById(R.id.answer8);
        answer8.setText("");

        //Resetting EditText
        userName.setText("");

        //Resetting quiz score
        totalScore = 0;

        ScrollView mainScrollView = findViewById(R.id.ScrollViewID);
        mainScrollView.fullScroll(ScrollView.FOCUS_UP);
    }

}

