package com.sibaamap.recyclerviewgirdlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHoder>{

    private Context mContext;
    private List<User> mLisUser;

    public UserAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<User> list){
        this.mLisUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHoder holder, int position) {
        User user = mLisUser.get(position);
        if(user==null){
            return;
        }
        holder.imgUser.setImageResource(user.getResouceImage());
        holder.tvName.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        if (mLisUser != null){
            return mLisUser.size();
        }
        return 0;
    }

    public class UserViewHoder extends RecyclerView.ViewHolder{

        private ImageView imgUser;
        private TextView tvName;

        public UserViewHoder(@NonNull View itemView) {
            super(itemView);

            imgUser = itemView.findViewById(R.id.img_user);
            tvName = itemView.findViewById(R.id.tv_name);
        }
    }
}
