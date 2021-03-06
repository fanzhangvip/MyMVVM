package com.xuexiang.mymvvm.view;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xuexiang.mymvvm.R;
import com.xuexiang.mymvvm.base.BaseActivity;
import com.xuexiang.mymvvm.databinding.ActivityLoginBinding;
import com.xuexiang.mymvvm.viewmodel.LoginModel;

/**
 * @author xuexiang
 * @date 2018/3/14 上午11:15
 */
@Route(path = "/ui/login")
public class LoginActivity extends BaseActivity<ActivityLoginBinding> implements ILoginView {
    /**
     * 布局的资源id
     *
     * @return
     */
    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    /**
     * 绑定ViewModel
     */
    @Override
    protected void bindViews() {
        binding.setLoginModel(new LoginModel().attachV(this));
    }

    @Override
    public void onFinished() {
        finish();
    }
}
