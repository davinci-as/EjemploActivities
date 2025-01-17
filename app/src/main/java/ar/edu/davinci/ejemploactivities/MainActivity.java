package ar.edu.davinci.ejemploactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean condition = true;
        if(!condition) {
            setContentView(R.layout.activity_main_table);
        } else {
            setContentView(R.layout.activity_main);
            Button viewButton = findViewById(R.id.viewButton);
            viewButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), StudentListActivity.class);
                    intent.putExtra("id_producto", 100);
                    intent.putExtra("new_product", true);
                    startActivity(intent);
                }
            });
        }
    }
}