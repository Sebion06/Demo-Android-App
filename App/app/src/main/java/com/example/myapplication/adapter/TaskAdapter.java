package com.example.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Task;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private ArrayList<Task> mDataset;
    private AppCompatActivity mActivity;

    public TaskAdapter(ArrayList<Task> dataset) {
        mDataset = dataset;
    }


    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout viewgroup = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);
        TaskViewHolder vh = new TaskViewHolder(viewgroup);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = mDataset.get(position);
        holder.updateTask(task);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder {
        private CheckBox mChkStatus;
        private TextView mTVName;

        public TaskViewHolder(@NonNull View view) {

            super(view);

            mChkStatus = view.findViewById(R.id.itemTask_chkDone);
            mTVName = view.findViewById(R.id.itemTask_txtName);

        }

        public void updateTask(Task task) {
            mChkStatus.setChecked(task.isDone());
            mTVName.setText(task.getName());
        }
    }
}