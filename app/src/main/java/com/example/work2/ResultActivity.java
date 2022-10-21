package com.example.work2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.util.Log;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d("01","这是ResultActivity的创建onCreate");
        Intent intent=new Intent();
        intent.putExtra("data","连日来，宁夏吴忠同心县的万亩马铃薯种植基地迎来收获。今年，这里的马铃薯种植基地应用水肥一体化栽培，马铃薯产量逐年上升，平均亩产达4吨以上。");
    setResult(888,intent);
    finish();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("01","这是ResultActivity的启动onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("01","这是ResultActivity的停止onStop");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("01","这是ResultActivity的恢复onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("01","这是ResultActivity的暂停onPause");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("01","这是ResultActivity的重启onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("01","这是ResultActivity的销毁onDestroy");
    }
}