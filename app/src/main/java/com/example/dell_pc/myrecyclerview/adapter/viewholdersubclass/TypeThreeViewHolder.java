package com.example.dell_pc.myrecyclerview.adapter.viewholdersubclass;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell_pc.myrecyclerview.bean.ModeBase;
import com.example.dell_pc.myrecyclerview.R;

/**
 * @author dell-pc
 * @date 2018/6/27
 */

public class TypeThreeViewHolder extends TypeAbstractViewHolder {
    public ImageView avatar;
    public TextView name;
    public TextView content;
    public ImageView contentimage;

    public TypeThreeViewHolder(View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        content = itemView.findViewById(R.id.content);
        contentimage = itemView.findViewById(R.id.contentimage);
    }

    @Override
    public void bindHolder(ModeBase modeBase) {
        avatar.setBackgroundResource(modeBase.avatarColor);
        name.setText(modeBase.name);
        content.setText(modeBase.content);
        contentimage.setBackgroundResource(modeBase.contentColor);
    }
}
