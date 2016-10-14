package com.example.salim3dd.listview_coustmadpter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Salim3DD on 5/12/2016.
 */
public class listAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<listItme> mlistItmes;


    public listAdapter(Context mContext, ArrayList<listItme> mlistItmes) {
        this.mContext = mContext;
        this.mlistItmes = mlistItmes;

    }

    @Override
    public int getCount() {
        return mlistItmes.size();
    }

    @Override
    public Object getItem(int position) {
        return mlistItmes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext,R.layout.row_itme,null);

        TextView name = (TextView)v.findViewById(R.id.textView_name);
        TextView desc = (TextView)v.findViewById(R.id.textView_desc);

        name.setText(mlistItmes.get(position).getName());
        desc.setText(mlistItmes.get(position).getDesc());

        //Typeface typeface = Typeface.createFromAsset(, "font.otf");
        //name.setTypeface(typeface);

        v.setTag(mlistItmes.get(position).getId());

        return v;
    }

}
