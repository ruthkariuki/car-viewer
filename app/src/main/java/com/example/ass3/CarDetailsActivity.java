package com.example.ass3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CarDetailsActivity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CarDetailsActivity extends AppCompatActivity {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CarDetailsActivity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CarDetailsActivity.
     */
    // TODO: Rename and change types and number of parameters
    public static CarDetailsActivity newInstance(String param1, String param2) {
        CarDetailsActivity fragment = new CarDetailsActivity();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        Bundle extras = getIntent().getExtras();
        String details = extras.getString("details");
        String car = extras.getString("car");

        ImageView imageView = (ImageView) findViewById(R.id.car);
        TextView textView = (TextView) findViewById(R.id.label);

        MobileArrayAdapter.setImage(car, imageView);

        textView.setText(details);
    }


}