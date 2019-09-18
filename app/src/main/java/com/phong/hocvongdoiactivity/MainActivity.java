package com.phong.hocvongdoiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "On Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "On Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "On Restart", Toast.LENGTH_SHORT).show();
    }

    public void moManHinhCheKhuatToanBo(View view) {
        //Muốn mở màn hình nào đó thì dùng Intent
        Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
        startActivity(intent);
    }

    public void moManHinhCheKhuatMotPhan(View view) {
        //Muốn mở màn hình nào đó thì dùng Intent
        Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
        startActivity(intent);
    }
}
