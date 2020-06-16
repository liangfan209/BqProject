package com.bq.project1;

import android.os.Bundle;

import com.bq.comm_config_lib.configration.AppArouter;
import com.bq.comm_config_lib.msgService.MessageEvent;
import com.fan.baseuilibrary.utils.ToastUtils;

import org.greenrobot.eventbus.EventBus;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().post(new MessageEvent(AppArouter.USER_CENTER_SERVICE, data -> {
            ToastUtils.showToast(this, data+"");
        }));
    }
}
