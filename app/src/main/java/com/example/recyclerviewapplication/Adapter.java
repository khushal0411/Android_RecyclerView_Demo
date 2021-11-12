package com.example.recyclerviewapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<DataItems> desclist;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.img);
            this.textView = (TextView) itemView.findViewById(R.id.tv_desc);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativelayout_listdata);
        }
    }
    @NonNull
    @NotNull
    @Override

    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Adapter.MyViewHolder holder, int position) {
        DataItems dataItems = desclist.get(position);
        holder.textView.setText(dataItems.getDesc());
        holder.imageView.setImageResource(dataItems.getImg());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You Have clicked "+dataItems.getDesc(),Toast.LENGTH_SHORT).show();
                String title= dataItems.getDesc();
                if(title=="C"){
                    Intent intent=new Intent(v.getContext(),TestActivity.class);
                    intent.putExtra("titile","Welcome To C language");
                    v.getContext().startActivity(intent);
                }
                if(title=="C++"){

                    Intent intent=new Intent(v.getContext(),TestActivity.class);
                    intent.putExtra("titile","Welcome To C++ language");
                    v.getContext().startActivity(intent);
                }
                if(title=="Java"){
                    Intent intent=new Intent(v.getContext(),TestActivity.class);
                    intent.putExtra("titile","Welcome To Java language");
                    v.getContext().startActivity(intent);
                }
                if(title=="Julia"){
                    Intent intent=new Intent(v.getContext(),TestActivity.class);
                    intent.putExtra("titile","Welcome To Julia language");
                    v.getContext().startActivity(intent);
                }
                if(title=="Dart"){
                    Intent intent=new Intent(v.getContext(),TestActivity.class);
                    intent.putExtra("titile","Welcome To Dart language");
                    v.getContext().startActivity(intent);
                }
                if(title=="Go"){
                    Intent intent=new Intent(v.getContext(),TestActivity.class);
                    intent.putExtra("titile","Welcome To Go language");
                    v.getContext().startActivity(intent);
                }
                if(title=="JavaScript"){
                    Intent intent=new Intent(v.getContext(),TestActivity.class);
                    intent.putExtra("titile","Welcome To JavaSrcipt language");
                    v.getContext().startActivity(intent);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return desclist.size();
    }
public Adapter(List<DataItems> desclist)
{
    this.desclist=desclist;
}

}
