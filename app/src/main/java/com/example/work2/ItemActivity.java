package com.example.work2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        Log.d("01","这是Activity生命周期的创建onCreate");
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ItemActivity.this,ResultActivity.class);
            test.launch(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("01","这是ItemActivity的启动onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("01","这是ItemActivity的停止onStop");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("01","这是ItemActivity的恢复onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("01","这是ItemActivity的暂停onPause");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("01","这是ItemActivity的重启onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("01","这是ItemActivity的销毁onDestroy");
    }

    public ActivityResultLauncher test = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>(){

                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == 888){
                        Log.d("xr","onActivityResultLauncher...");
                        textView.setText(result.getData().getStringExtra("data"));
                    }
                }
            });
}