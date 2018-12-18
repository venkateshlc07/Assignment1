package com.example.raksha_ramya.longpressevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Longpress extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.longpress);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(Longpress.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
