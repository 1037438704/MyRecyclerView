package com.example.dell_pc.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.dell_pc.myrecyclerview.adapter.MyAdapter;
import com.example.dell_pc.myrecyclerview.bean.ModeBase;

import java.util.ArrayList;

/**
 * @author dell-pc
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModeBase> list;
    private MyAdapter myAdapter;
    private int colors[] = {R.color.colorred,
            R.color.colorblue,
            R.color.colororange};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            int type = (int) ((Math.random() * 3) + 1);
            ModeBase modeBase = new ModeBase();
            modeBase.avatarColor = colors[type - 1];
            modeBase.type = type;
            modeBase.name = "name : " + i;
            modeBase.content = "content : " + i;
            modeBase.contentColor = colors[(type + 1) % 3];
            Log.d("zdl", modeBase.toString());
            list.add(modeBase);

        }
        //在适配器中写了一个方法用来传输集合和接收集合
        myAdapter.addList(list);
        myAdapter.notifyDataSetChanged();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        list = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));
        myAdapter = new MyAdapter(this);
        recyclerView.setAdapter(myAdapter);
    }
}
