package com.example.signsystem.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.signsystem.LoginActivity;
import com.example.signsystem.R;
import com.example.signsystem.bean.Student;
import com.example.signsystem.utils.DoubleClickHelper;
import com.example.signsystem.utils.SPUtils;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import cn.bingoogolapple.qrcode.zxing.QRCodeEncoder;

public class StudentActivity extends AppCompatActivity {

    private ImageView ivQrcode;
    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        initView();
    }


    public void initView() {
        Student student = SPUtils.getObject("user", Student.class, this);
        tvName = findViewById(R.id.tv_stu_name);
        tvName.setText("姓名：" + student.getName() + ",学号：" + student.getStuNum());
        ivQrcode = findViewById(R.id.iv_qrcode);
        new Thread(new Runnable() {
            @Override
            public void run() {
                //通过二维码控件生成二维码 格式未 stuNum+学号
                Bitmap bitmap = QRCodeEncoder.syncEncodeQRCode("stuNum" + student.getStuNum(), 200);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ivQrcode.setImageBitmap(bitmap);
                    }
                });
            }
        }).start();
    }

    //这里是在登录界面label上右上角添加三个点，里面可添加其他功能
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);//这里是调用menu文件夹中的main.xml，在登陆界面label右上角的三角里显示其他功能
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_info:
                SPUtils.put(StudentActivity.this, "login", false);
                finish();
                startActivity(new Intent(StudentActivity.this, LoginActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        if (DoubleClickHelper.isOnDoubleClick()) {
            // 移动到上一个任务栈，避免侧滑引起的不良反应
            moveTaskToBack(false);
            System.exit(0);
        } else {
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
        }
    }


}