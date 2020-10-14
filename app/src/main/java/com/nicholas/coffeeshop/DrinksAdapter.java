package com.nicholas.coffeeshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksAdapter.ViewHolder> {
    Context c;
    ArrayList<Drink> drinks;

    public DrinksAdapter(Context c, ArrayList<Drink> drinks) {
        this.c = c;
        this.drinks = drinks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_drinks, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Drink drink = drinks.get(position);
        holder.imgDrink.setImageResource(drink.getImagesrc());
        holder.txtName.setText(drink.getName());
        holder.txtDesc.setText(drink.getDesc());
        holder.txtPrice.setText("$" + drink.getPrice());
    }

    @Override
    public int getItemCount() {
        return drinks.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgDrink;
        TextView txtName, txtDesc, txtPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgDrink = itemView.findViewById(R.id.imgCoffee);
            txtName = itemView.findViewById(R.id.drinkName);
            txtDesc = itemView.findViewById(R.id.drinkDesc);
            txtPrice = itemView.findViewById(R.id.drinkPrice);
        }
    }
}
