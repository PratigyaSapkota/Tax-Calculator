package com.example.calculatetax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btn;
    EditText input,result;
    float finalsalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.input);
        result=findViewById(R.id.value);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1=input.getText().toString();
                if (input1.length()==0){
                    input.setError("Enter your salary");
                }
            else  {
                    float salary = Float.parseFloat(input.getText().toString());
                    TaxValue taxval=new TaxValue(salary);
                    float case1 = taxval.case1();
                    float case2 = taxval.case2();
                    float case3 = taxval.case3();
                    finalsalary = salary * 12;
                    if (finalsalary <= 200000) {
                        result.setText(Float.toString(case1));
                        Toast.makeText(MainActivity.this,"Your yearly tax amount is="+case1,Toast.LENGTH_LONG).show();
                    } else if (finalsalary > 200000 && finalsalary <= 350000) {
                        result.setText(Float.toString(case2));
                        Toast.makeText(MainActivity.this,"Your yearly tax amount is="+case2,Toast.LENGTH_LONG).show();
                    } else {
                        result.setText(Float.toString(case3));
                        Toast.makeText(MainActivity.this,"Your yearly tax amount is="+case3,Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }}






