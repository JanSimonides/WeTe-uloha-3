package com.example.wete4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton pizza, halusky, rezen;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = findViewById(R.id.buton);
        radioGroup = findViewById(R.id.rg);
        halusky = findViewById(R.id.halusky);
        pizza = findViewById(R.id.pizza);
        rezen = findViewById(R.id.rezen);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String response = "";
                int id = radioGroup.getCheckedRadioButtonId();
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                if(id == halusky.getId()){
                    Toast.makeText(getApplicationContext(), "halsky",Toast.LENGTH_SHORT).show();
                    response = "halusky";
                }
                else if(id == rezen.getId()){
                    Toast.makeText(getApplicationContext(), "rezen",Toast.LENGTH_SHORT).show();
                    response = "rezen";
                }else if(id == pizza.getId()){
                    Toast.makeText(getApplicationContext(), "pizza",Toast.LENGTH_SHORT).show();
                    response = "pizza";
                }else {
                    Toast.makeText(getApplicationContext(), "chyba", Toast.LENGTH_SHORT).show();
                }
                intent.putExtra("response", response);
                startActivity(intent);
            }
        });
    }
}
