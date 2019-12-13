package com.example.mohsin.customlistview;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {
    ListView listView;
    String bookTitle[] = {"101 Inspiring Quotation", "A Conversation About Healthy Food","A Time Travelers Guide to Istanbul"};
    String bookDescription[] = {"By Truly-Amazing.com", "Nicholas A. Lesica","by Luther Hughes"};
    int bookimages[] = {R.drawable.inspiration, R.drawable.healthyeatingbook1,R.drawable.book2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
//setting adapter.
        MyAdapter adapter = new MyAdapter(this, bookTitle, bookDescription, bookimages);
        listView.setAdapter(adapter);
        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Intent i = new Intent(MainActivity.this,Book0.class);
                    startActivity(i); }
                if (position ==  1) {
                    Intent i = new Intent(MainActivity.this,Book1.class);
                    startActivity(i); }
                if (position ==  2) {
                    Intent i = new Intent(MainActivity.this,book2.class);
                    startActivity(i);
                }
            }
        }
        );
    }
}