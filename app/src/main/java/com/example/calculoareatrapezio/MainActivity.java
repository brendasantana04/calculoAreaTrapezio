package com.example.calculoareatrapezio;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
 *@author:<Brenda santana>
 *@ra:<1110482313042>
 */

public class MainActivity extends AppCompatActivity {

    private EditText editTextBaseMaior;
    private EditText editTextBaseMenor;
    private EditText editTextAltura;
    private Button buttonCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBaseMaior = findViewById(R.id.editTextBaseMaior);
        editTextBaseMenor = findViewById(R.id.editTextBaseMenor);
        editTextAltura = findViewById(R.id.editTextAltura);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularArea();
            }
        });
    }

    private void calcularArea() {
        int baseMaior = Integer.parseInt(editTextBaseMaior.getText().toString());
        int baseMenor = Integer.parseInt(editTextBaseMenor.getText().toString());
        int altura = Integer.parseInt(editTextAltura.getText().toString());

        int area = (baseMaior + baseMenor) * altura / 2;

        textViewResultado.setText("Área do trapézio: " + area);
    }
}