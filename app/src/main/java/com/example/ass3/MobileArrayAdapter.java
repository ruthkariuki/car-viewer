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
    private final String[] cars;

    public MobileArrayAdapter(Context context, String[] cars) {
        super(context, R.layout.list_image, cars);
        this.context = context;
        this.cars = cars;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_image, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.car);
        textView.setText(cars[position]);

        // Change icon based on name
        setImage(cars[position], imageView);

        return rowView;
    }

    public static void setImage(String carName, ImageView imageView) {

        if (carName.equals("hyundai")) {
            imageView.setImageResource(R.drawable.hyundai);
        } else if (carName.equals("land_rover")) {
            imageView.setImageResource(R.drawable.land_rover);
        } else if (carName.equals("maserati")) {
            imageView.setImageResource(R.drawable.maserati);
        } else if(carName.equals("mercedez")){
            imageView.setImageResource(R.drawable.mercedez);
        } else if (carName.equals("suzuki")) {
            imageView.setImageResource(R.drawable.suzuki);

        } else if (carName.equals("toyota")) {
            imageView.setImageResource(R.drawable.toyota);

        }
    }
}
