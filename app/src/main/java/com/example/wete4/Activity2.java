package com.example.wete4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView text1;
    private ImageButton imgButton;
    private CheckBox box;
    private Switch switchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitvity2);
        text1 = findViewById(R.id.text2);
        imgButton = findViewById(R.id.imageButton);
        box = findViewById(R.id.box);
        switchCompat = findViewById(R.id.switchButton);

        String response = "";
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            response = bundle.getString("response");
        }

        text1.setText(response);
        box.setText("Potvrdzujem obed: " + response);

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (box.isChecked())
                    box.setChecked(false);
                else
                    box.setChecked(true);

                if (switchCompat.isChecked())
                    switchCompat.setChecked(false);
                else
                    switchCompat.setChecked(true);
            }
        });
    }
}
