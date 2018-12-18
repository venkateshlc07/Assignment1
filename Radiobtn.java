package com.example.raksha_ramya.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Radiobtn extends AppCompatActivity {

    Button btn;
    RadioButton rbtMale, rbtFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobtn);

        btn = (Button) findViewById(R.id.btn);

        rbtFemale = (RadioButton) findViewById(R.id.rbtFemale);
        rbtMale = (RadioButton) findViewById(R.id.rbtMale);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rbtMale.isChecked()) {
                    Toast.makeText(Radiobtn.this, "U have Selected Male", Toast.LENGTH_SHORT).show();
                } else if (rbtFemale.isChecked()) {
                    Toast.makeText(Radiobtn.this, "U have Selected Female", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Radiobtn.this, "Please select one item", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
