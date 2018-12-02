package com.example.joj.discovercluj;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class OpenSettings extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open_settings);
        getSupportActionBar().hide();

        try {
            PackageInfo pInfo = this.getPackageManager().getPackageInfo(getPackageName(), 0);
            String version = pInfo.versionName;
            TextView version_tw = (TextView) findViewById(R.id.settings_version_details);
            version_tw.setText(version);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        final Button settingsButton = (Button) findViewById(R.id.open_settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String msg = "Access settings";
                Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                toast.show();

                Intent intent = new Intent();
                intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                Uri uri = Uri.fromParts("package", getPackageName(), null);
                intent.setData(uri);
                startActivity(intent);
            }
        });

        final ImageButton thirdButton = (ImageButton) findViewById(R.id.home_button);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                finish();
            }
        });
    }

}
