package com.example.mohsin.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class MyAdapter extends BaseAdapter {
       Context context;
       String[] bookTitle;
       String[] bookDescription;
       int[] bookimages;
       // constructor
    public MyAdapter(Context context, String[] bookTitle, String[] bookDescription, int[] bookimages) {
        this.context = context;
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
        this.bookimages = bookimages;
    }
    //getters
    @Override
    public int getCount() {
        return bookTitle.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        if(convertView == null) {
            //convert the layout xml to view.
            convertView = LayoutInflater.from(context).inflate(R.layout.row, null);
            ImageView images = convertView.findViewById(R.id.image);
            TextView myTitle = convertView.findViewById(R.id.textView1);
            TextView myDescription = convertView.findViewById(R.id.textView2);
            images.setImageResource(bookimages[i]);
            myTitle.setText(bookTitle[i]);
            myDescription.setText(bookDescription[i]);}
            return convertView;
        }
    }
