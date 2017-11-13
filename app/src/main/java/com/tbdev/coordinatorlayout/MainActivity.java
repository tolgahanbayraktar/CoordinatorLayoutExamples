package com.tbdev.coordinatorlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tbdev.coordinatorlayout.Samples.CollapsingToolbarFab;
import com.tbdev.coordinatorlayout.Samples.CollapsingToolbarTabs;
import com.tbdev.coordinatorlayout.Samples.ToobarAndFab;
import com.tbdev.coordinatorlayout.Samples.ToolbarTabs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToolbarFab = (Button) findViewById(R.id.buttonToolbarFab);
        buttonToolbarFab.setOnClickListener(this);
        Button buttonCollapsingToolbarFab = (Button) findViewById(R.id.buttonCollapsingToolbarFab);
        buttonCollapsingToolbarFab.setOnClickListener(this);
        Button buttonCollapsingToolbarTabs = (Button) findViewById(R.id.buttonCollapsingToolbarTabs);
        buttonCollapsingToolbarTabs.setOnClickListener(this);
        Button buttonToolbarTabs = (Button) findViewById(R.id.buttonToolbarTabs);
        buttonToolbarTabs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonToolbarFab:
                startActivity(new Intent(this, ToobarAndFab.class));
                break;
            case R.id.buttonCollapsingToolbarFab:
                startActivity(new Intent(this, CollapsingToolbarFab.class));
                break;
            case R.id.buttonToolbarTabs:
                startActivity(new Intent(this, ToolbarTabs.class));
                break;
            case R.id.buttonCollapsingToolbarTabs:
                startActivity(new Intent(this, CollapsingToolbarTabs.class));
                break;
        }
    }
}
