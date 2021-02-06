package com.example.tp2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Calculatrice extends AppCompatActivity {
    String EtatInitial = "0";
    String result;
    Double n3=0.00 ;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Operation Out
        Button btnOut =  findViewById(R.id.buttonFerme);
        btnOut.setOnClickListener(v -> {
            Toast.makeText(this, "GOOD BY", Toast.LENGTH_SHORT).show();
            finish();
            System.exit(0);
        });
        //Operation Rest
        Button btnRaz = findViewById(R.id.buttonRaz);
        btnRaz.setOnClickListener(v ->
            rez()
        );
        //Operation Result
        Button btnResult = findViewById(R.id.buttonResulta);
        btnResult.setOnClickListener(v ->{
            btnResult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Methode qui on a cree pour rélise les operations
                    Operation();
                }});
        });

         }
    public void rez(){
        Button btnRazz = findViewById(R.id.buttonRaz);
        TextView Razz = findViewById(R.id.textViewRESULTA);
        EditText ed1 = findViewById(R.id.editTextNumber1);
        EditText ed2 = findViewById(R.id.editTextNumber2);
        Razz.setText("0");
        ed1.setText("");
        ed2.setText("");
        Toast.makeText(this, "REST INPUT ", Toast.LENGTH_SHORT).show();

    }
        public void Operation() {
            EditText num1 = findViewById(R.id.editTextNumber1);
            EditText num2 = findViewById(R.id.editTextNumber2);
            TextView textViewResult = findViewById(R.id.textViewRESULTA);
            radioGroup = findViewById(R.id.radioGroup);
            int radioId = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(radioId);
            Double n1=0.0 ;
            Double n2=0.0;
            Double n3;

         //   if (!num1.equals("") || num2.equals("")) {
                if (radioButton.getText().equals("Plus")) {
                     n1 = Double.parseDouble(num1.getText().toString());
                     n2 = Double.parseDouble(num2.getText().toString());
                     n3 = n1 + n2;
                    result = String.valueOf(n3);
                    Intent intentt = new Intent(this ,ActivityResulta.class);
                    String n4 = (String) radioButton.getText();
                    intentt.putExtra("param1",n1);
                    intentt.putExtra("param2",n2);
                    intentt.putExtra("param3",result);
                    intentt.putExtra("param4",n4);
                    startActivity(intentt);
                 //   textViewResult.setText(result);
                }

                if (radioButton.getText().equals("Moins")) {
                     n1 = Double.parseDouble(num1.getText().toString());
                     n2 = Double.parseDouble(num2.getText().toString());
                     n3 = n1 - n2;
                    result = String.valueOf(n3);
                    Intent intentt = new Intent(this ,ActivityResulta.class);
                    String n4 = (String) radioButton.getText();
                    intentt.putExtra("param1",n1);
                    intentt.putExtra("param2",n2);
                    intentt.putExtra("param3",result);
                    intentt.putExtra("param4",n4);
                    startActivity(intentt);
                  //  textViewResult.setText(result);
                    }

                if (radioButton.getText().equals("Devise")) {
                     n1 = Double.parseDouble(num1.getText().toString());
                     n2 = Double.parseDouble(num2.getText().toString());
                     n3 = n1 / n2;
                    result = String.valueOf(n3);
                    Intent intentt = new Intent(this ,ActivityResulta.class);
                    String n4 = (String) radioButton.getText();
                    intentt.putExtra("param1",n1);
                    intentt.putExtra("param2",n2);
                    intentt.putExtra("param3",result);
                    intentt.putExtra("param4",n4);
                    startActivity(intentt);
                   // textViewResult.setText(result);
                }
                  if (radioButton.getText().equals("Multi")) {
                     n1 = Double.parseDouble(num1.getText().toString());
                     n2 = Double.parseDouble(num2.getText().toString());
                     n3 = n1 * n2;
                    result = String.valueOf(n3);
                      Intent intentt = new Intent(this ,ActivityResulta.class);
                      String n4 = (String) radioButton.getText();
                      intentt.putExtra("param1",n1);
                      intentt.putExtra("param2",n2);
                      intentt.putExtra("param3",result);
                      intentt.putExtra("param4",n4);
                      startActivity(intentt);
                //    textViewResult.setText(result);
              //  Toast.makeText(this, "OPERATION : " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }


}

}

