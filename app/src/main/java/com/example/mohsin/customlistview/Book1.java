package com.example.mohsin.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Book1 extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
        pdfView=findViewById(R.id.pdfviewid);
        pdfView.fromAsset("A conversation about healthy food.pdf").load();
    }
}
