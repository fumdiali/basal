package com.base111.basal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutAppActivity extends AppCompatActivity {
    ListView lv;
    String[] helpLines = {"FAQ","Contact Us\nQuestions?Help?",
            "About","Terms & Conditions"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);

        lv = (ListView)findViewById(R.id.about_main_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,helpLines);
        lv.setAdapter(adapter);

        //set on click listener
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //if(i==0){intent?}
            }
        });
    }//end of on create method
}
