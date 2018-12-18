package com.example.raksha_ramya.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class Checkbox1 extends Activity
{
    CheckBox chkBoxApple;
    CheckBox chkBoxMango;
    CheckBox chkBoxBanana;
    CheckBox chkBoxGrapes;
    CheckBox chkBoxWatermelon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

        initialUISetup();
    }

    public void initialUISetup() {
        chkBoxApple = (CheckBox) findViewById(R.id.chkBoxApple);
        chkBoxMango = (CheckBox) findViewById(R.id.chkBoxMango);
        chkBoxBanana = (CheckBox) findViewById(R.id.chkBoxBanana);
        chkBoxGrapes = (CheckBox) findViewById(R.id.chkBoxGrapes);
        chkBoxWatermelon = (CheckBox) findViewById(R.id.chkBoxWatermelon);

        chkBoxApple.setOnCheckedChangeListener(new myCheckBoxChnageClicker());
        chkBoxMango.setOnCheckedChangeListener(new myCheckBoxChnageClicker());
        chkBoxBanana.setOnCheckedChangeListener(new myCheckBoxChnageClicker());
        chkBoxGrapes.setOnCheckedChangeListener(new myCheckBoxChnageClicker());
        chkBoxWatermelon.setOnCheckedChangeListener(new myCheckBoxChnageClicker());
    }

    class myCheckBoxChnageClicker implements CheckBox.OnCheckedChangeListener
    {

        @Override
        public void onCheckedChanged(CompoundButton buttonView,
                                     boolean isChecked) {
            // TODO Auto-generated method stub

            // Toast.makeText(CheckBoxCheckedDemo.this, &quot;Checked =&gt; &quot;+isChecked, Toast.LENGTH_SHORT).show();

            if(isChecked) {
                if(buttonView==chkBoxApple) {
                    showTextNotification("Apple");
                }

                if(buttonView==chkBoxMango) {
                    showTextNotification("Mango");
                }

                if(buttonView==chkBoxBanana) {
                    showTextNotification("Banana");
                }

                if(buttonView==chkBoxGrapes) {
                    showTextNotification("Grapes");
                }

                if(buttonView==chkBoxWatermelon) {
                    showTextNotification("Watermelon");
                }
            }
        }
    }

    public void showTextNotification(String msgToDisplay) {
        Toast.makeText(this, msgToDisplay, Toast.LENGTH_SHORT).show();
    }
}
