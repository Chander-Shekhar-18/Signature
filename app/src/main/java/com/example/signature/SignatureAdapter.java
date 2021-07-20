package com.example.signature;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SignatureAdapter extends RecyclerView.Adapter<SignatureAdapter.signatureViewAdapter> {
    private Context context;
    private ArrayList<SignatureData> list;

    public SignatureAdapter(Context context, ArrayList<SignatureData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public signatureViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.signature_adapter, parent, false);
        return new signatureViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SignatureAdapter.signatureViewAdapter holder, int position) {
        SignatureData currentItem = list.get(position);
        Picasso.get()
                .load(currentItem.getImageUrl())
                .into(holder.imageViewSignature);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class signatureViewAdapter extends RecyclerView.ViewHolder {

        private ImageView imageViewSignature;

        public signatureViewAdapter(@NonNull View itemView) {
            super(itemView);
            imageViewSignature = itemView.findViewById(R.id.imageViewSign);
        }
    }
}
