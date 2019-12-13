package com.example.mohsin.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Book0 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book0);
        pdfView=findViewById(R.id.pdfviewid);
        pdfView.fromAsset("101-Inspiring-Quotations-TA.pdf").load();


    }
}
