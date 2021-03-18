package com.sabdika.homework_activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int count = 0;
    private TextView countView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countView = (TextView) findViewById(R.id.countResult);
        if (savedInstanceState != null) {
            countView.setText(savedInstanceState.getString("count_text"));
        }
    }

    public void increaseCount(View view) {
        count++;
        if(countView !=null){
            countView.setText(Integer.toString(count));
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("count_text",
                countView.getText().toString());
    }
}