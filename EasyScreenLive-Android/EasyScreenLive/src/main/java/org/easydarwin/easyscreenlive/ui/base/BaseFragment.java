package org.easydarwin.easyscreenlive.ui.base;


import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public abstract class BaseFragment extends Fragment {

    protected String TAG;
    protected BaseActivity activity;
    // progressDialog/sp/application 等使用activity.xx 调用

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TAG = getClass().getSimpleName();

        activity = (BaseActivity) getActivity();
    }

    protected void intent2Activity(Class<? extends Activity> tarActivity) {
        Intent intent = new Intent(activity, tarActivity);
        startActivity(intent);
    }

    protected void showToast(String msg) {
        ToastUtils.showToast(activity, msg, Toast.LENGTH_SHORT);
    }

    protected void showLog(String msg) {
        Log.i(TAG, msg);
    }

    protected void showProgressDialog() {
        activity.showProgressDialog();
    }

    protected void dismissProgressDialog() {
        activity.dismissProgressDialog();
    }
}
