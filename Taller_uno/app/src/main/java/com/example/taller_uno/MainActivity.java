package com.example.taller_uno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button contador1_action;
    private Button contador2_action;
    public int contador;
    public int contador2;
    private TextView aume;
    private TextView dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
        contador2 = 0;
        aume = findViewById(R.id.aumentar_text);
        dis = findViewById(R.id.disminuir_text);

        contador1_action = findViewById(R.id.action_buton_aumentar);
        contador2_action = findViewById(R.id.action_buton_disminuir);
        contador1_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador ++;
                aume.setText(contador);
            }
        });

        contador2_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2 ++;
                dis.setText(contador2);
            }
        });

    }
}
