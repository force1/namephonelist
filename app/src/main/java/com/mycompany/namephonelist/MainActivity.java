package com.mycompany.namephonelist;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] Name;
    String [] phonenumbers;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res= getResources();
        Name= res.getStringArray(R.array.Name);
        phonenumbers=res.getStringArray(R.array.phonenumbers);

        listView=(ListView)findViewById(R.id.listView);
        vizadapter Adapter=new vizadapter(this,Name,phonenumbers);
        listView.setAdapter(Adapter);
    }
}
