package com.example.dell_pc.myrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.dell_pc.myrecyclerview.bean.ModeBase;
import com.example.dell_pc.myrecyclerview.R;
import com.example.dell_pc.myrecyclerview.adapter.viewholdersubclass.TypeAbstractViewHolder;
import com.example.dell_pc.myrecyclerview.adapter.viewholdersubclass.TypeOneViewHolder;
import com.example.dell_pc.myrecyclerview.adapter.viewholdersubclass.TypeThreeViewHolder;
import com.example.dell_pc.myrecyclerview.adapter.viewholdersubclass.TypeTwoViewHolder;

import java.util.ArrayList;

/**
 *
 * @author dell-pc
 * @date 2018/6/25
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    /**
     * 这里一定要实例化不然集合会报空指针异常
     * */
    private ArrayList<ModeBase> modeList = new ArrayList<>();
    private LayoutInflater layoutInflater;

    public MyAdapter(Context context){
        layoutInflater = LayoutInflater.from(context);
    }
    /**
     * 从我的主界面传进来的
     * @param list
     * */
    public void addList(ArrayList<ModeBase> list){
        modeList.addAll(list);
    }
    /**
     *  @param parent  这个是视图参数
     *  @param viewType 在网上查找说这个是用来判断你的视图类型的  看了还是不怎么明白 下面附上链接
     *                  http://frank-zhu.github.io/android/2015/02/25/android-recyclerview-part-2/      慕课网上找到的
     * */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("zdl2","viewType -----"+ viewType);
        //在这里判断数据进入那个界面
        switch (viewType){
            case ModeBase.TYPE_ONE:
                return new TypeOneViewHolder(layoutInflater.inflate(R.layout.item_type_one,parent,false));
            case ModeBase.TYPE_TWO:
                return new TypeTwoViewHolder(layoutInflater.inflate(R.layout.item_type_two,parent,false));
            case ModeBase.TYPE_THREE:
                return new TypeThreeViewHolder(layoutInflater.inflate(R.layout.item_type_three,parent,false));
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //这里是像你的bindHolder中传的list集合中具体是哪条数据
        ((TypeAbstractViewHolder)holder).bindHolder(modeList.get(position));
    }

    @Override
    public int getItemCount() {
        return modeList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return modeList.get(position).type;
    }
}
