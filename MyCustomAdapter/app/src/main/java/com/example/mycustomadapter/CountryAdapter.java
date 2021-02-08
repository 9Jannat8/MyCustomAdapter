package com.example.mycustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryAdapter extends BaseAdapter {

    int[] flags;
    String[] countryNames;
    Context context;
    private LayoutInflater inflater;

    //ata constructor mainActivity theke data receive korar jonno...and constructor name hobe class name er moto
    CountryAdapter(Context context, String[] countryNames, int[] flags) {

        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;

    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //sample_view ke view te convert korar jonno layoutInflater lagebe...age er jonno variable declare kore neya hoyeche..
        if(convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//inflate korar age inflater service ta nite hoice
            convertView = inflater.inflate(R.layout.sample_view, parent, false);//je layout k view te rupantor korbe se layout dite hobe
            //uporer line a layout ta k view te rupantor kora hoyeche..tai ai view ta k akta view variables er modde rakhte hobe..
        }
        ImageView imageView = convertView.findViewById(R.id.imgId);//image tak find kore imageview variable a rakhlam
        TextView textView = convertView.findViewById(R.id.countryNameId);

        imageView.setImageResource(flags[position]);//imageview variable er maddome image k set kore dicci positio onujai
        textView.setText(countryNames[position]);


        return convertView;
    }
}
