package com.example.jhkim.GeojeDriver;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button callBtn = (Button) findViewById(R.id.callBtn);
        Button applyBtn = (Button) findViewById(R.id.applyBtn);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_CALL);
                String phNum = "tel:" + "16616335";
                myIntent.setData(Uri.parse(phNum));
                startActivity(myIntent);
            }
        });

        applyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_CALL);
                String phNum = "tel:" + "01093033335";
                myIntent.setData(Uri.parse(phNum));
                startActivity(myIntent);
            }
        });

    }


}
