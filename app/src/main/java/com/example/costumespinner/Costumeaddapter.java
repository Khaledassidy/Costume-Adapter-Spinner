package com.example.costumespinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Costumeaddapter extends BaseAdapter {
    Context context;
    int resource;
    ArrayList<modelclass> arrayList;

    public Costumeaddapter(Context context,int resource, ArrayList<modelclass> arrayList){
        this.context=context;
        this.resource=resource;
        this.arrayList=arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public modelclass getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public void add(modelclass modelclass){
        arrayList.add(modelclass);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if(view==null){
            view= LayoutInflater.from(this.context).inflate(this.resource,parent,false);
        }
        ImageView imageView=view.findViewById(R.id.logo);
        TextView textView=view.findViewById(R.id.name);
        modelclass modelclass=getItem(position);
        imageView.setImageResource(modelclass.getImageresource());
        textView.setText(modelclass.getName());

        return view;
    }
}
