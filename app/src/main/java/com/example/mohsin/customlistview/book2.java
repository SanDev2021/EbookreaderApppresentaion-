package com.example.mohsin.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book2 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);
        pdfView = findViewById(R.id.pdfviewid);
        pdfView.fromAsset("a-time-travelers-guide-to-istanbul.pdf").load();
    }
}
