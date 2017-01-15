package com.mycompany.namephonelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.jar.Attributes;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * Created by rock on 1/2/2017.
 */
public class vizadapter extends ArrayAdapter<String> {


    Context c;

    String[] nameArray;
    String[] phoneArray;



    vizadapter(Context c, String[] names, String[] phones)

    {

        super(c,R.layout.single_row,R.id.textView1,names);


        this.nameArray=names;
        this.phoneArray=phones;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) getContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.single_row,parent,false);
        TextView textView1=(TextView) row.findViewById(R.id.textView1);
        TextView textView2=(TextView) row.findViewById(R.id.textView2);
        textView1.setText(nameArray[position]);
        textView2.setText(phoneArray[position]);
        return super.getView(position, convertView, parent);

    }
}
