package com.example.zy.androidgithubuse;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * ================================================
 * 版    本：1.0
 * 创建日期：2018/4/2
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class MyAdapter extends BaseQuickAdapter<User, BaseViewHolder> {
    public MyAdapter(int layoutResId, @Nullable List<User> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(final BaseViewHolder helper, final User item) {
        RelativeStateLayout relativeStateLayout = helper.getView(R.id.relative);
        if (item.isClick()) {
            relativeStateLayout.setLayoutClick(true);
        }else {
            relativeStateLayout.setLayoutClick(false);
        }
    }
}
