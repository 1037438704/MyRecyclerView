package com.example.dell_pc.myrecyclerview.adapter.viewholdersubclass;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell_pc.myrecyclerview.bean.ModeBase;

/**
 * 这个类是一个公共的抽象方法目的是为了方便
 * @author dell-pc
 * @date 2018/6/27
 */

public abstract class TypeAbstractViewHolder extends RecyclerView.ViewHolder{

    public TypeAbstractViewHolder(View itemView) {
        super(itemView);
    }
    /**
     *  里面是一个实体类
     *  @param  modeBase
     * */
    public abstract void bindHolder(ModeBase modeBase);
}
