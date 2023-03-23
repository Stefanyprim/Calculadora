package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        Resultado = findViewById(R.id.Resultado);
        Resultado.setVisibility(View.INVISIBLE);
    }

    public void somar(View v) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int tl = num1 + num2;
        Resultado.setVisibility(View.VISIBLE);
        Resultado.setText(tl + "");
    }

    public void subtrair(View v) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int tl = num1 - num2;
        Resultado.setVisibility(View.VISIBLE);
        Resultado.setText(tl + "");
    }

    public void multiplicar(View v) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int tl = num1 * num2;
        Resultado.setVisibility(View.VISIBLE);
        Resultado.setText(tl + "");
    }

    public void dividir(View v) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int tl = num1 / num2;
        Resultado.setVisibility(View.VISIBLE);
        Resultado.setText(tl + "");
    }
}



