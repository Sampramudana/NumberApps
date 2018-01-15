package com.pramudana.sam.numberapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum;
    Button btnCheck;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum = (EditText)findViewById(R.id.etNum);
        btnCheck = (Button)findViewById(R.id.btnCheck);
        txtResult = (TextView)findViewById(R.id.txtResult);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number = etNum.getText().toString();

                if (number.equalsIgnoreCase("0")) {
                    txtResult.setText("Null");
                }else if (number.equalsIgnoreCase("1")){
                    txtResult.setText("Not Null");
                }else if (number.equalsIgnoreCase("2")){
                    txtResult.setText("Not Null");
                }else if (number.equalsIgnoreCase("3")){
                    txtResult.setText("Not Null");
                }else if (number.equalsIgnoreCase("4")){
                    txtResult.setText("Not Null");
                }else if (number.equalsIgnoreCase("5")){
                    txtResult.setText("Not Null");
                }else if (number.equalsIgnoreCase("6")){
                    txtResult.setText("Not Null");
                }else if (number.equalsIgnoreCase("7")){
                    txtResult.setText("Not Null");
                }else if (number.equalsIgnoreCase("8")){
                    txtResult.setText("Not Null");
                }else if (number.equalsIgnoreCase("9")){
                    txtResult.setText("Not Null");
                }else {
                    etNum.setError("Please only input number 1 - 9");
                }
            }
        });
    }
}
