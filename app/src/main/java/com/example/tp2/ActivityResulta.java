package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityResulta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resulta);
        TextView tv44 = findViewById(R.id.textview4);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv3 = findViewById(R.id.textView3);
        TextView tv4 = findViewById(R.id.textView4);

        Bundle et = getIntent().getExtras();
        Double a = new Double(et.getDouble("param1"));
        Double a2 = new Double(et.getDouble("param2"));
        String a3 = new String(et.getString("param3"));
        String a4 = new String(et.getString("param4"));

                        tv2.setText(" the First number is: "+a);
                        tv3.setText(" the Second number is: "+a2);
                        tv4.setText(" the Result number is: "+a3);
                        tv44.setText(" the Operation nom is: "+a4);

    }
    public void onClick(View view) {
        back();
    }
    void back(){
        Intent intent = new Intent(this, Calculatrice.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    }
