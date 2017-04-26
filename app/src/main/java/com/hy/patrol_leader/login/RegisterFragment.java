package com.hy.patrol_leader.login;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.hy.patrol_leader.R;
import com.hy.patrol_leader.base.BaseFragment;
import com.hy.patrol_leader.widget.TimeButton;

import butterknife.BindView;

/**
 * Created time : 2017/4/26 14:27.
 *
 * @author HY
 */

public class RegisterFragment extends BaseFragment {
    @BindView(R.id.edt_register_username)
    protected EditText mEdtRegisterUsername;
    @BindView(R.id.edt_register_code)
    protected EditText mEdtRegisterCode;
    @BindView(R.id.edt_register_password)
    protected EditText mEdtRegisterPassword;
    @BindView(R.id.time_btn)
    protected TimeButton mTimeBtn;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTimeBtn.onCreate();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getContentLayout() {
        return R.layout.fragment_register;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mTimeBtn.onDestroy();
    }
}
