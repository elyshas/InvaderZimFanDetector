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
import java.util.ArrayList;
import java.util.List;

// TODO - assign Views to constants instead of multiple calls to findViewById()
// TODO - implement logging
public class MainActivity extends AppCompatActivity {

    //***Calculate final score***
    private int totalScore;
    //***+1 for correct answers***
    private static final int correctAnswer = 1;
    //***Saving score for rotation***
    private static final String GAME_SCORE = "gameScore";

    //***Referencing XML and linking***
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Save score upon rotation and oncreate
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
    public void calculateQuestion1() {
        // Populating list of RadioButton ID's for Question 1
        List<Integer> question1RadioButtonIdList = new ArrayList<>();
        question1RadioButtonIdList.add(R.id.q1a1);
        question1RadioButtonIdList.add(R.id.q1a2);

        // Iterate through list and check if answer is correct/incorrect for each radio button in list
        for (int currentRadioButtonId : question1RadioButtonIdList) {
            switch (currentRadioButtonId) {
                case R.id.q1a1:
                    if (((RadioButton) findViewById(R.id.q1a1)).isChecked()) {
                        // CORRECT - Puffer fish and gnomes
                        totalScore += correctAnswer;
                    }
                    break;
                case R.id.q1a2:
                    if (((RadioButton) findViewById(R.id.q1a2)).isChecked()) {
                        // INCORRECT (no point added) - Squirrels and gnomes
                    }
                    break;
            }
        }
    }

    //*** Question 2 - GIR favorite food - checkboxes***
    public void calculateQuestion2() {
        // Populating list of checkbox ID's for Question 2
        List<Integer> question2CheckboxIdList = new ArrayList<>();
        question2CheckboxIdList.add(R.id.q2a1);
        question2CheckboxIdList.add(R.id.q2a2);
        question2CheckboxIdList.add(R.id.q2a3);
        question2CheckboxIdList.add(R.id.q2a4);

        // Iterate through list and check if answer is correct/incorrect for each checkbox in list
        for (int currentCheckboxId : question2CheckboxIdList) {
            switch (currentCheckboxId) {
                case R.id.q2a1:
                    if (((CheckBox) findViewById(R.id.q2a1)).isChecked()) {
                        // CORRECT - Pizza
                        totalScore += correctAnswer;
                    }
                    break;
                case R.id.q2a2:
                    if (((CheckBox) findViewById(R.id.q2a2)).isChecked()) {
                        // CORRECT - Waffles
                        totalScore += correctAnswer;
                    }
                    break;
                case R.id.q2a3:
                    if (((CheckBox) findViewById(R.id.q2a3)).isChecked()) {
                        // INCORRECT (no point added) - peanuts
                    }
                    break;
                case R.id.q2a4:
                    if (((CheckBox) findViewById(R.id.q2a4)).isChecked()) {
                        // CORRECT - Tacos
                        totalScore += correctAnswer;
                    }
                    break;
            }
        }
    }

    //*** Question 3 - Zim's fake best friend - radio buttons***
    public void calculateQuestion3() {
        // Populating list of RadioButton ID's for Question 3
        List<Integer> question3RadioButtonIdList = new ArrayList<>();
        question3RadioButtonIdList.add(R.id.q3a1);
        question3RadioButtonIdList.add(R.id.q3a2);
        question3RadioButtonIdList.add(R.id.q3a3);

        // Iterate through list and check if answer is correct/incorrect for each radiobutton in list
        for (int currentRadioButtonId : question3RadioButtonIdList) {
            switch (currentRadioButtonId) {
                case R.id.q3a1:
                    if (((RadioButton) findViewById(R.id.q3a1)).isChecked()) {
                        // INCORRECT (no point added) - Larry
                    }
                    break;
                case R.id.q3a2:
                    if (((RadioButton) findViewById(R.id.q3a2)).isChecked()) {
                        // CORRECT - Keef
                        totalScore += correctAnswer;
                    }
                    break;
                case R.id.q3a3:
                    if (((RadioButton) findViewById(R.id.q3a3)).isChecked()) {
                        // INCORRECT (no point added) - Garry
                    }
                    break;
            }
        }
    }

    //*** Question 4 - Gaz's favorite things - checkboxes***
    public void calculateQuestion4() {
        // Populating list of checkbox ID's for Question 4
        List<Integer> question4CheckboxIdList = new ArrayList<>();
        question4CheckboxIdList.add(R.id.q4a1);
        question4CheckboxIdList.add(R.id.q4a2);
        question4CheckboxIdList.add(R.id.q4a3);

        // Iterate through list and check if answer is correct/incorrect for each checkbox in list
        for (int currentCheckboxId : question4CheckboxIdList) {
            switch (currentCheckboxId) {
                case R.id.q4a1:
                    if (((CheckBox) findViewById(R.id.q4a1)).isChecked()) {
                        // CORRECT - Video Games
                        totalScore += correctAnswer;
                    }
                    break;
                case R.id.q4a2:
                    if (((CheckBox) findViewById(R.id.q4a2)).isChecked()) {
                        // INCORRECT (no point added) - Building robots
                    }
                    break;
                case R.id.q4a3:
                    if (((CheckBox) findViewById(R.id.q4a3)).isChecked()) {
                        // CORRECT - Insulting Dib
                        totalScore += correctAnswer;
                    }
                    break;
            }
        }
    }

    //*** Question 5 - Name of Zim's zit - radio buttons***
    public void calculateQuestion5() {
        // Populating list of RadioButton ID's for Question 5
        List<Integer> question5RadioButtonIdList = new ArrayList<>();
        question5RadioButtonIdList.add(R.id.q5a1);
        question5RadioButtonIdList.add(R.id.q5a2);
        question5RadioButtonIdList.add(R.id.q5a3);

        // Iterate through list and check if answer is correct/incorrect for each radiobutton in list
        for (int currentRadioButtonId : question5RadioButtonIdList) {
            switch (currentRadioButtonId) {
                case R.id.q5a1:
                    if (((RadioButton) findViewById(R.id.q5a1)).isChecked()) {
                        // INCORRECT (no point added) - Walton Chunky
                    }
                    break;
                case R.id.q5a2:
                    if (((RadioButton) findViewById(R.id.q5a2)).isChecked()) {
                        // CORRECT - Pustulio
                        totalScore += correctAnswer;
                    }
                    break;
                case R.id.q5a3:
                    if (((RadioButton) findViewById(R.id.q5a3)).isChecked()) {
                        // INCORRECT (no point added) - Walton Chunky
                    }
                    break;
            }
        }
    }

    //*** Question 6 - GIR's best songs - checkboxes***
    public void calculateQuestion6() {
        // Populating list of checkbox ID's for Question 6
        List<Integer> question6CheckboxIdList = new ArrayList<>();
        question6CheckboxIdList.add(R.id.q6a1);
        question6CheckboxIdList.add(R.id.q6a2);
        question6CheckboxIdList.add(R.id.q6a3);

        // Iterate through list and check if answer is correct/incorrect for each checkbox in list
        for (int currentCheckboxId : question6CheckboxIdList) {
            switch (currentCheckboxId) {
                case R.id.q6a1:
                    if (((CheckBox) findViewById(R.id.q6a1)).isChecked()) {
                        // INCORRECT (no point added) - Squirrelzee
                    }
                    break;
                case R.id.q6a2:
                    if (((CheckBox) findViewById(R.id.q6a2)).isChecked()) {
                        // CORRECT - Merry Jingly
                        totalScore += correctAnswer;
                    }
                    break;
                case R.id.q6a3:
                    if (((CheckBox) findViewById(R.id.q6a3)).isChecked()) {
                        // CORRECT - The Doom Song
                        totalScore += correctAnswer;
                    }
                    break;
            }
        }
    }

    //*** Question 7 - Zim's horrible career day - radio buttons***
    public void calculateQuestion7() {
        // Populating list of RadioButton ID's for Question 7
        List<Integer> question7RadioButtonIdList = new ArrayList<>();
        question7RadioButtonIdList.add(R.id.q7a1);
        question7RadioButtonIdList.add(R.id.q7a2);
        question7RadioButtonIdList.add(R.id.q7a3);

        // Iterate through list and check if answer is correct/incorrect for each radiobutton in list
        for (int currentRadioButtonId : question7RadioButtonIdList) {
            switch (currentRadioButtonId) {
                case R.id.q7a1:
                    if (((RadioButton) findViewById(R.id.q7a1)).isChecked()) {
                        // INCORRECT (no point added) - Burger Slave
                    }
                    break;
                case R.id.q7a2:
                    if (((RadioButton) findViewById(R.id.q7a2)).isChecked()) {
                        // INCORRECT (no point added) - McBunsALot
                    }
                    break;
                case R.id.q7a3:
                    if (((RadioButton) findViewById(R.id.q7a3)).isChecked()) {
                        // CORRECT - McMeaties
                        totalScore += correctAnswer;
                    }
                    break;
            }
        }
    }

    //*** Question 8 - Irken Rulers - EditText question***
    public void calculateQuestion8() {
        EditText answer8 = findViewById(R.id.answer8);
        String answerNumber8 = answer8.getText().toString();
        // Check answer & add +1 if correct
        if (answerNumber8.equals("2")) {
            totalScore += correctAnswer;
        }
    }

    //***Calculate user total score and display proper response based on their score***
    public void calculateAndDisplayScore(View view) {
        calculateScore();

        EditText userName = findViewById(R.id.userName);
        displayScore(userName);

        ResetUI(userName);
    }

    private void calculateScore() {
        //Calculating RadioButton & Checkbox answers (1-7)
        calculateQuestion1();
        calculateQuestion2();
        calculateQuestion3();
        calculateQuestion4();
        calculateQuestion5();
        calculateQuestion6();
        calculateQuestion7();
        //Calculating 8th answer (EditText)
        calculateQuestion8();
    }

    private void displayScore(EditText userName) {
        String name = userName.getText().toString();
        // TODO - convert to using StringBuilder
        if (totalScore >= 9) {
            Toast.makeText(this, "Congratulations " + name
                    + ", I'll let you live... FOR NOW!", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Your acceptable score was: "
                    + totalScore, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Stupid " + name
                    + ", you must now suffer my wrath of DOOM!", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Your pitiful score was: "
                    + totalScore, Toast.LENGTH_LONG).show();
        }
    }

    private void ResetUI(EditText userName) {
        //***Resetting all quiz questions after submit button is selected***
        resetRadioButtons();
        resetCheckboxes();
        resetEditTexts(userName);
        resetScore();
        returnToTop();
    }

    private void resetRadioButtons() {
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
    }

    private void resetCheckboxes() {
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
    }

    private void resetEditTexts(EditText userName) {
        //Reset QUESTION 8 EditText
        EditText answer8 = findViewById(R.id.answer8);
        answer8.setText("");

        //Resetting EditText
        userName.setText("");
    }

    private void resetScore() {
        //Resetting quiz score
        totalScore = 0;
    }

    private void returnToTop() {
        //Returning to first input field at top
        ScrollView mainScrollView = findViewById(R.id.ScrollViewID);
        mainScrollView.fullScroll(ScrollView.FOCUS_UP);
    }
}

