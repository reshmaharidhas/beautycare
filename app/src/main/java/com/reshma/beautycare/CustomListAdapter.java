package com.reshmaharidhas.reshma.beautycare;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Reshma on 23-01-2017.
 */

public class CustomListAdapter extends ArrayAdapter<String>{

    Activity context;
    String[] itemname;
    Integer[] imgid;

    public CustomListAdapter(Activity context,String[] itemname,Integer[] imgid) {
        super(context,R.layout.mylist,itemname);
        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowview=inflater.inflate(R.layout.mylist,null,true);

        ImageView imageView=(ImageView)rowview.findViewById(R.id.icon);
        TextView textView=(TextView)rowview.findViewById(R.id.item);

        textView.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        return rowview;
    }
}
