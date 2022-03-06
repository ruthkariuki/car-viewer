package com.example.ass3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String[][] CARS =
            new String[][]{{"hyundai", "land_rover", "maserati", "mercedez", "suzuki", "toyota"},
                    {"Hyundai: Introducing the first vehicle we've ever created to be exclusively electric. Its 303-mile range will take you further",
                    "Land Rover is a British brand of predominantly four-wheel drive, off-road capable vehicles, owned by multinational car manufacturer",
                    "Maserati S.p.A. is an Italian luxury vehicle manufacturer. Established on 1 December 1914, in Bologna, Italy, the company's headquarters are now in Modena",
                    "Mercedes-Benz, commonly referred to as just Mercedes, is a German luxury automotive marque",
                    "Suzuki Motor Corporation is a Japanese multinational corporation headquartered in Minami-ku, Hamamatsu, Japan",
                    "Toyota Motor Corporation is a Japanese multinational automotive manufacturer headquartered in Toyota City, Aichi, Japan. It was founded by Kiichiro Toyoda and incorporated on August 28, 1937"}
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(new MobileArrayAdapter(this, CARS[0]));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                //link to the next activity
                Intent intent = new Intent(getApplicationContext(), CarDetailsActivity.class);
                intent.putExtra("details", CARS[1][position]);
                intent.putExtra("car", CARS[0][position]);
                //start the next activity
                startActivity(intent);

            }
        });
    }
}