package com.example.practical_2_part_b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        findViewById(R.id.button_zero).setBackgroundColor(Color.parseColor("#FF94B4"));
        if (mCount % 2 == 0)
        {
            view.setBackgroundColor(Color.parseColor("#3700b3"));
        }
        else
        {
            view.setBackgroundColor(Color.parseColor("#03dac5"));
        }
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void zero(View view) {
        mCount = 0;
        findViewById(R.id.button_count).setBackgroundColor(Color.parseColor("#6200ee"));
        view.setBackgroundColor(Color.parseColor("#aaaaaa"));
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}