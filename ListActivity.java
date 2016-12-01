package com.bignerdranch.android.studentlist;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListActivity extends ActionBarActivity{
private Student student=new Student();
    private RecyclerView mRecyclerView;
    private List<String> mName;
    private ListAdapter mAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

       stuName();
        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter = new ListAdapter());

    }

    protected  void stuName() {
        student.setName(new String[]{"A","B","C","D","E","F","G","H","I","J","K","L" ,
        "M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"});
        student.setGrade("16级");
        mName=new ArrayList<String>() ;
        for (int i = 0; i <student.getName().length ; i++)
        {
           mName.add("姓名:\t"+student.getName(i)+"\n年级:\t"+student.getGrade());
        }
    }

    class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder>
    {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                    ListActivity.this).inflate(R.layout.litem, parent,
                    false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position)
        {
            holder.tv.setText(mName.get(position));
        }

        @Override
        public int getItemCount()
        {
            return mName.size();
        }

        class MyViewHolder extends ViewHolder
        {

            TextView tv;

            public MyViewHolder(View view)
            {
                super(view);
                tv = (TextView) view.findViewById(R.id.id_num);
            }
        }
    }

}
