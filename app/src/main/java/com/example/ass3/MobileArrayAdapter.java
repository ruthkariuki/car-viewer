package com.example.ass3;

import android.widget.ArrayAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public MobileArrayAdapter(Context context, String[] values) {
        super(context, R.layout.list_image, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_image, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.car);
        textView.setText(values[position]);

        // Change icon based on name
        setImage(values[position], imageView);

        return rowView;
    }

    public static void setImage(String value, ImageView imageView) {
        String s = value;

        if (s.equals("hyundai")) {
            imageView.setImageResource(R.drawable.hyundai);
        } else if (s.equals("land_rover")) {
            imageView.setImageResource(R.drawable.land_rover);
        } else if (s.equals("maserati")) {
            imageView.setImageResource(R.drawable.maserati);
        } else if(s.equals("mercedez")){
            imageView.setImageResource(R.drawable.mercedez);
        } else if (s.equals("suzuki")) {
            imageView.setImageResource(R.drawable.suzuki);

        } else if (s.equals("toyota")) {
            imageView.setImageResource(R.drawable.toyota);

        }
    }
}
