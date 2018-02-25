package com.example.amrihanif.amrihanif_1202150075_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class detail extends AppCompatActivity {
    private int counts = 0;
    private Button plus, minus;
    private TextView value;
    private ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");
        String descs = intent.getStringExtra("descs");
        int gambar = intent.getIntExtra("gambar", 0);

        TextView textTitle = findViewById(R.id.title);
        TextView textDesc = findViewById(R.id.desc);
        ImageView imageGambar = findViewById(R.id.imageview);

        textTitle.setText(title);
        textDesc.setText(descs);
        imageGambar.setImageResource(gambar);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        value = findViewById(R.id.txt);
        battery = findViewById(R.id.battery);
        //memanggil level list
        battery.setImageResource(R.drawable.baterai);
        value.setText(Integer.toString(counts+1) + "L");

    }
    //jika tombol min disentuh
    public void minus(View view) {
        counts--;
        if (value != null) {
            switch (counts) {
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
    //jika tombol plus disentuh
    public void plus(View view) {
        counts++;
        if (value != null) {
            switch (counts) {
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }


}
