package com.base111.basal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by fumnanyad on 4/28/17.
 */
public class CustomGridViewActivity extends BaseAdapter {

    private Context mContext;
    private final String[] gridString;
    private final int[] gridImageId;


    //constructor
    public CustomGridViewActivity(Context context,String[] gridString,int[] gridImageId){

        mContext = context;
        this.gridImageId = gridImageId;
        this.gridString = gridString;
    }//end of constructor

    @Override
    public int getCount(){
        return gridString.length;
    }

    @Override
    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View gridViewApp;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            gridViewApp = new View(mContext);
            gridViewApp = inflater.inflate(R.layout.gridview_main_layout,null);
            TextView textViewApp = (TextView)gridViewApp.findViewById(R.id.gridview_text);
            ImageView imageViewApp = (ImageView)gridViewApp.findViewById(R.id.gridview_image);

            textViewApp.setText(gridString[position]);
            imageViewApp.setImageResource(gridImageId[position]);
        }else {
            gridViewApp = (View)convertView;
        }
        return gridViewApp;
    }
}
