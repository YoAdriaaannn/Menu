package com.example.atomi.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView firstTextView = findViewById(R.id.menu_item_1);

        Log.i("MainActivity.Java", firstTextView.getText().toString());
        // Find second menu item TextView and print the text to the logs
        TextView secondTextView = findViewById(R.id.menu_item_2);

        Log.i("MainActivity.Java", secondTextView.getText().toString());
        // Find third menu item TextView and print the text to the logs
        TextView thirdTextView = findViewById(R.id.menu_item_3);

        Log.i("MainActivity.Java", thirdTextView.getText().toString());
    }
}