package com.base111.basal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView appGridView;

    String[] topics = {
            "Math","English","Science",
            "Igbo","General Knowledge","Computer Tech"
    };

    int[] topicImage = {
            R.drawable.math_launcher,R.drawable.english_launcher,
            R.drawable.science_launcher,R.drawable.ibo_launcher,
            R.drawable.genknow_launcher,R.drawable.compsci_launcher
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGridViewActivity adapterView = new CustomGridViewActivity(MainActivity.this,topics,topicImage);
        appGridView = (GridView)findViewById(R.id.appGrid);
        appGridView.setAdapter(adapterView);

        //set on click listener
        appGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long id) {
                if (position==0){
                    //math launch
                    Intent math = new Intent(MainActivity.this,MathActivity.class);
                    startActivity(math);
                }
                if (position==1){
                    //eng launch
                    Intent eng = new Intent(MainActivity.this,EngActivity.class);
                    startActivity(eng);
                }
                if (position==2){
                    //sci launch
                    Intent sci = new Intent(MainActivity.this,SciActivity.class);
                    startActivity(sci);
                }
                if (position==3){
                    //ibo launch
                    Intent ibo = new Intent(MainActivity.this,IboActivity.class);
                    startActivity(ibo);
                }
                if (position==4){
                    //genknow launch
                    Intent gen = new Intent(MainActivity.this,GenActivity.class);
                    startActivity(gen);
                }
                if (position==5){
                    //comp launch
                    Intent comp = new Intent(MainActivity.this,CompActivity.class);
                    startActivity(comp);
                }
            }
        });
    }// end of on create method


    // create options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.about_main:
                Intent about = new Intent(MainActivity.this,AboutAppActivity.class);
                startActivity(about);
                return true;
            case R.id.search_web:
                Intent web = new Intent(Intent.ACTION_VIEW);
                web.setData(Uri.parse("https://wwww.bing.com"));
                startActivity(web);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
