package com.sungkyul.aa.setFragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.sungkyul.aa.R;

public class SettingActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        setTitle("설정");
    }
}
