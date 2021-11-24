package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button btnSetZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
        btnSetZero = findViewById(R.id.button_setZero);
    }

    private void setZero(View view) {
        mShowCount.setText("0");
        mCount = 0;
        btnSetZero.setBackgroundColor(Color.GRAY);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            if (mCount % 2 == 0) view.setBackgroundColor(Color.MAGENTA);
            else view.setBackgroundColor(Color.CYAN);

            mShowCount.setText(Integer.toString(mCount));

            if (!mShowCount.getText().toString().equals("0")) {
                btnSetZero.setBackgroundColor(Color.GREEN);
                btnSetZero.setOnClickListener(this::setZero);
            }
        }
    }

}