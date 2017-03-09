package com.example.duni.group7orienteering;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onClickLoginBtn(View view){
        Intent intent=new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}
