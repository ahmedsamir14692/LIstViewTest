package com.example.android.listviewtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ListView listView;
    String[] names={
            "ahmed",
            "mohamed",
            "mostafa",
            "huossan",
            "adel",
            "mohsen",
            "samir",
            "abdelaziz",
            "yonis",
            "walid","ahmed",
            "mohamed",
            "mostafa",
            "huossan",
            "adel",
            "mohsen",
            "samir",
            "abdelaziz",
            "yonis",
            "walid","ahmed",
            "mohamed",
            "mostafa",
            "huossan",
            "adel",
            "mohsen",
            "samir",
            "abdelaziz",
            "yonis",
            "walid"
    };
    String[] names2={
            "ahmed",
            "mohamed",
            "mostafa",
            "huossan",
            "adel",
            "mohsen",
            "samir",
            "abdelaziz",
            "yonis",
            "walid","ahmed",
            "mohamed",
            "mostafa",
            "huossan",
            "adel",
            "mohsen",
            "samir",
            "abdelaziz",
            "yonis",
            "walid","ahmed",
            "mohamed",
            "mostafa",
            "huossan",
            "adel",
            "mohsen",
            "samir",
            "abdelaziz",
            "yonis",
            "walid"
    };
    int[] images = {
R.drawable.images,R.drawable.hqdefault,R.drawable.before_cookie,R.drawable.androidparty

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listView);
custom adapter = new custom(this);
listView.setAdapter(adapter);
    }

    class hloder {

        ImageView imageView;
        TextView text2;
        TextView text1;
         public hloder(View v)

         {
             imageView=(ImageView)v.findViewById(R.id.imageView);
             text2= (TextView) v.findViewById(R.id.text2);
             text1= (TextView) v.findViewById(R.id.text);

         }


    }

class custom extends ArrayAdapter {

Context c;

    custom(Context c) {
        super(c,R.layout.row,R.id.text,names);
this.c=c;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        hloder holder;
if(convertView==null){
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         view = inflater.inflate(R.layout.row,parent,false);
    holder=new hloder(view);
view.setTag(holder);
}
        else{
    view=convertView;
holder= (hloder) view.getTag();
        }
        TextView text2 = holder.text2;
        ImageView imageView= holder.imageView;
        TextView text1= holder.text1;
        text1.setText(names[position]);
text2.setText(names2[position]);
        try{
   imageView.setImageResource(images[position]);}
        catch(Exception e )
        {
            imageView.setImageResource(images[images.length-1]);

        }
        return  view;

    }
}


}