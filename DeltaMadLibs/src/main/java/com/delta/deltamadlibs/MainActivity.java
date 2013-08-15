package com.delta.deltamadlibs;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {


    ///Member variables
    TextView mTextView;
    Button mSwitcherButton;
    String myMadLib;
    int flipFlopper;
    //Add a List as a member variable here
    List<String> mSillyWordsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.storyText);


        // Setup the list here, and reference it in the myMadLib string.
        mSillyWordsList = new ArrayList<String>();

        mSillyWordsList.add("Frazzlewazzit");
        mSillyWordsList.add("dingleberry");
        mSillyWordsList.add("foozle");
        mSillyWordsList.add("frankendouche");
        mSillyWordsList.add("gigglewart");
        mSillyWordsList.add("Washingclone");
        mSillyWordsList.add("jigglewatt");




        myMadLib = "Two BLANK, both alike in dignity,\n" +
                "In fair BLANK, where we lay our scene,\n" +
                "From ancient BLANK break to new mutiny,\n" +
                "Where civil blood makes civil hands unclean.\n" +
                "From forth the fatal loins of these two foes\n" +
                "A pair of star-cross`d BLANK take their life;\n" +
                "Whole misadventured piteous overthrows\n" +
                "Do with their BLANK bury their parents` strife.\n" +
                "The fearful passage of their BLANK love,\n" +
                "And the continuance of their parents` rage,\n" +
                "Which, but their children`s end, nought could BLANK,\n" +
                "Is now the BLANK hours` traffic of our stage;\n" +
                "The which if you with BLANK BLANK attend,\n" +
                "What here shall BLANK, our toil shall strive to mend.";


        mTextView.setText(myMadLib);
        flipFlopper = 0;

        //setup our listener onclick
        mSwitcherButton = (Button) findViewById(R.id.switchButton);
        mSwitcherButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (flipFlopper == 0)
                {
                    //This is where you should loop through your list and create a string to describe the values.
                    String s = ""; //a list should go here";

                    for( String item : mSillyWordsList ) {
                        s = s + item + "\n";
                    }
                    mTextView.setText(s);
                    flipFlopper = 1;
                }else{
                    //this displays the madlib instead.
                    mTextView.setText(myMadLib);
                    flipFlopper = 0;
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
