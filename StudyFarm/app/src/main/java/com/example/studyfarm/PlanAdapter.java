package com.example.studyfarm;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PlanAdapter extends  RecyclerView.Adapter<PlanAdapter.MyViewHolder>{
private ArrayList<Plan> mDataset;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView st_name;

    //ViewHolder
    public MyViewHolder(View view) {
        super(view);
        st_name = (TextView) view.findViewById(R.id.st_name);
    }
}

    public PlanAdapter(ArrayList<Plan> myData){
        this.mDataset = myData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.studyplanitem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanAdapter.MyViewHolder holder, int position) {

        holder.st_name.setText(mDataset.get(position).getSt_name());

        //클릭이벤트
        holder.st_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //클릭시 name과 좌표정보를 지도 프래그먼트로 보내자.
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                activity.getFragmentManager().beginTransaction().replace(R.id.frame_layout, new FragmentHome()).addToBackStack(null).commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
        }
