package com.example.myrandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText batas;
    TextView rdm;
    Button Random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final java.util.Random random = new Random ();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        batas = (EditText)findViewById(R.id.batas1);
        rdm = (TextView)findViewById(R.id.Random);
        Random = (Button)findViewById(R.id.button);
        Random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = batas.getText().toString();
                int batas =0;
                int hasil;
                if (number.equals("")){
                    Toast.makeText(MainActivity.this, "please enter some details", Toast.LENGTH_SHORT).show();
                }
                else {
                    batas = Integer.parseInt(number);

//                    batas = Double.valueOf(number);
                    hasil = random.nextInt(batas);
//                    hasil = (int)Math.random() * (batas + 1);
                    rdm.setText(String.valueOf(hasil));
                }
            }
        });
    }

    public void random (View v){
        String number = batas.toString();
        int batas =0;
        int hasil;
        if (number.equals("")){
            Toast.makeText(MainActivity.this, "please enter some details", Toast.LENGTH_SHORT).show();
        }
        else {
            batas = Integer.parseInt(number);
        }
        hasil = (int)Math.random()*(batas+1);
        rdm.setText(String.valueOf(hasil));

    }
}
