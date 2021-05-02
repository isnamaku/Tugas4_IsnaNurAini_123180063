package com.example.mymusik;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    private ArrayList<Music> music = new ArrayList<>();

    public void setReseps(ArrayList<Music> music) {
        if (music != null) {
            this.music.clear();
            this.music.addAll(music);
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(music.get(position));
    }

    @Override
    public int getItemCount() {
        return music.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvJudul, tvArtis;
        private ImageView ivImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvArtis = itemView.findViewById(R.id.tv_artis);
            ivImage = itemView.findViewById(R.id.iv_foto);
        }

        public void bind(Music music) {
            tvJudul.setText(music.getJudul());
            tvArtis.setText(music.getArtis());
            Glide.with(itemView.getContext())
                    .load(music.getGambar())
                    .into(ivImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Detail.class);
                    intent.putExtra("judul", music.getJudul());
                    intent.putExtra("artis", music.getArtis());
                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
