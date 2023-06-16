package com.error41.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MYAdapter extends RecyclerView.Adapter<MYAdapter.ViewHolder> {

    // 1 - Data

    private Context context;
    private ArrayList<GameModel> gameModelArrayList;

    // 2 -constructor

    public MYAdapter(Context context, ArrayList<GameModel> gameModelArrayList) {
        this.context = context;
        this.gameModelArrayList = gameModelArrayList;
    }



    // 3 - View Holder


     public   class  ViewHolder extends  RecyclerView.ViewHolder{
        private ImageView gameImg;
        private TextView gameTitle;


         public ViewHolder(@NonNull View itemView) {
             super(itemView);

             gameImg=itemView.findViewById(R.id.cardviewImage);
             gameTitle=itemView.findViewById(R.id.textviewcard);
         }
     }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext())
               .inflate(R.layout.card_item,parent,false);

              return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        GameModel model= gameModelArrayList.get(position);
        holder.gameTitle.setText(model.getGameNAme());
        holder.gameImg.setImageResource(model.getGameImage());


         holder.itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(context,""+"You chose :"+gameModelArrayList.get(position).getGameNAme(),Toast.LENGTH_SHORT).show();
             }
         });
    }

    @Override
    public int getItemCount() {
        return gameModelArrayList.size();
    }

}
