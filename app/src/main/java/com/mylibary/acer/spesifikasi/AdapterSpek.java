package com.mylibary.acer.spesifikasi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by ACER on 2/28/2018.
 */

public class AdapterSpek extends BaseAdapter {
    Context context;

    public  AdapterSpek (Context c){
        context = c;
    }

    public int [] spesifikasi = {
            R.drawable.f5,R.drawable.ipx,R.drawable.mi6,R.drawable.n8,
            R.drawable.s8,R.drawable.v7,R.drawable.alien,R.drawable.rog,
            R.drawable.razer,R.drawable.rogstrix,R.drawable.yoga,R.drawable.origin,
    };

    @Override
    public int getCount() {
        return spesifikasi.length;
    }

    @Override
    public Object getItem(int position) {
        return spesifikasi[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img = new ImageView(context);
        img.setImageResource(spesifikasi[position]);
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img.setLayoutParams(new GridView.LayoutParams(250, 250));
        return img;
    }
}
