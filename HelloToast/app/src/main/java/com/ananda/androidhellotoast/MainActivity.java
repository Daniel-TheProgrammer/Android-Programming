package com.ananda.androidhellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void countUp(View view) {
// What happens when user clicks on the button_count Button goes here.
    }
    public void showToast(View view) {
// What happens when user clicks on the button_toast Button goes here.
    }
}