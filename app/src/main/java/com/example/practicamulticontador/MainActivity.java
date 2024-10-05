package com.example.practicamulticontador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.zip.ZipError;

public class MainActivity extends AppCompatActivity {

    private int contador;
    private int partial1;
    private int partial2;
    private int partial3;
    private int partial4;
    private static final int ZERO = 0;
    private static final String ZERO_STR = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        initialiseComponentsAndListeners();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(("MultiContador"));
        }


    }

    private void initialiseComponentsAndListeners() {
        //Texts
        TextView sumGlobalTxt = findViewById(R.id.sumGloabalTxt);
        TextView partial1Txt = findViewById(R.id.partial1Txt);
        TextView partial2Txt = findViewById(R.id.partial2Txt);
        TextView partial3Txt = findViewById(R.id.partial3Txt);
        TextView partial4Txt = findViewById(R.id.partial4Txt);

        //Adders
        Button inc1Btn = findViewById(R.id.inc1Btn);
        Button inc2Btn = findViewById(R.id.inc2Btn);
        Button inc3Btn = findViewById(R.id.inc3Btn);
        Button inc4Btn = findViewById(R.id.inc4Btn);

        //Resets
        Button rstGlobalBtn = findViewById(R.id.rstGlobalBtn);
        Button rst1Btn = findViewById(R.id.rst1Btn);
        Button rst2Btn = findViewById(R.id.rst2Btn);
        Button rst3Btn = findViewById(R.id.rst3Btn);
        Button rst4Btn = findViewById(R.id.rst4Btn);



        rstGlobalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = ZERO; partial1 = ZERO; partial2 = ZERO; partial3 = ZERO; partial4 = ZERO;
                partial1Txt.setText(ZERO_STR );
                partial2Txt.setText(ZERO_STR );
                partial3Txt.setText(ZERO_STR );
                partial4Txt.setText(ZERO_STR );
                sumGlobalTxt.setText(ZERO_STR );

            }
        });

        rst1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador -= partial1;
                partial1 = ZERO;
                partial1Txt.setText(ZERO_STR);
                sumGlobalTxt.setText(String.valueOf(contador));
            }
        });

        rst2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador -= partial2;
                partial2 = ZERO;
                partial2Txt.setText(ZERO_STR);
                sumGlobalTxt.setText(String.valueOf(contador));
            }
        });

        rst3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador -= partial3;
                partial3 = ZERO;
                partial3Txt.setText(ZERO_STR);
                sumGlobalTxt.setText(String.valueOf(contador));
            }
        });

        rst4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador -= partial4;
                partial4 = ZERO;
                partial4Txt.setText(ZERO_STR);
                sumGlobalTxt.setText(String.valueOf(contador));
            }
        });

        inc1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                partial1++;
                contador++;
                partial1Txt.setText(String.valueOf(partial1));
                sumGlobalTxt.setText(String.valueOf(contador));
            }
        });

        inc2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                partial2++;
                contador++;
                partial2Txt.setText(String.valueOf(partial2));
                sumGlobalTxt.setText(String.valueOf(contador));
            }
        });

        inc3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                partial3++;
                contador++;
                partial3Txt.setText(String.valueOf(partial3));
                sumGlobalTxt.setText(String.valueOf(contador));
            }
        });

        inc4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                partial4++;
                contador++;
                partial4Txt.setText(String.valueOf(partial4));
                sumGlobalTxt.setText(String.valueOf(contador));
            }
        });


    }




}