package ar.edu.davinci.ejemploactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        Intent intent = getIntent();
        if(intent.hasExtra("id_producto")) {
            Log.i("viewButton", "Contiene el id del producto");
            Log.i("viewButton", "id_producto: " + intent.getIntExtra("id_producto", 0));
            boolean newProduct = intent.getBooleanExtra("new_product", false);
            TextView textView = findViewById(R.id.viewer);
            if(newProduct) {
                textView.setText("El producto es nuevo");
            } else {
                textView.setText("El producto es usado");
            }
        }
    }
}