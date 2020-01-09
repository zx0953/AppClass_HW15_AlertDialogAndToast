package com.example.appclass_hw15_alertdialogtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnToastOnClick(View view){
        Toast.makeText(MainActivity.this,"Hello world!", Toast.LENGTH_SHORT).show();
    }
    public void btnAlertOnClick(View view){
            //產生視窗物件
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("對話視窗測試 d(d＇∀＇)")   		//設定視窗標題
                    .setIcon(R.mipmap.ic_launcher)	//設定對話視窗圖示
                    .setMessage("這是一個對話視窗")	//設定顯示的文字
                    .setPositiveButton("關閉視窗",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();//dismiss:關閉回傳值 ；cancel:尚未完成工作關閉
                        }
                    })			//設定結束的子視窗
                    .show();		//呈現對話視窗

    }
}
