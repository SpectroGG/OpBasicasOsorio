package com.example.opbasicasosorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num;
    EditText num2;
    Button btn;
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) findViewById(R.id.n1);
        num2 = (EditText) findViewById(R.id.n2);
        btn = (Button) findViewById(R.id.suma);
        msg = (TextView) findViewById(R.id.res);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int nm = Integer.parseInt(num.getText().toString());
        int mn = Integer.parseInt(num2.getText().toString());
        int suma = (nm+mn);
        msg.setText("El resultado es "+nm+mn+"");

    }
}
