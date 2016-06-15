package com.jkxy.myfirstapp;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int permission = this.checkCallingOrSelfPermission("com.jkxy.myfirstapp.permission.accessable");
        if (permission == PackageManager.PERMISSION_GRANTED) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        } else {
            throw new SecurityException("You need permission:com.jkxy.myfirstapp.permission.accessable.");
        }
    }
}
