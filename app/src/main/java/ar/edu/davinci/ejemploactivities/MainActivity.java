package ar.edu.davinci.ejemploactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean condition = true;
        if(!condition) {
            setContentView(R.layout.activity_main_table);
        } else {
            setContentView(R.layout.activity_main);
        }
    }
}