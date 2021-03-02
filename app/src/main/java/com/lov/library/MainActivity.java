package com.lov.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnQrCode;
    Button btnPdfGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewInit();
    }

    void findViewInit(){
        btnQrCode = findViewById(R.id.btn_qrcode);
        btnQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startQrCode();
            }
        });

        btnPdfGenerator = findViewById(R.id.btn_pdfgenerator);
        btnPdfGenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPdfGenerator();
            }
        });


    }

    private void startQrCode(){
        Intent i = new Intent(MainActivity.this, QrCodeActivity.class);
        startActivity(i);
    }
    private void startPdfGenerator(){
        Intent i = new Intent(MainActivity.this, PdfGeneratorActivity.class);
        startActivity(i);
    }
}