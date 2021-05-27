package com.nicholas.coffeeshop;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

// 7. Janlup bikin ini dulu (eh tapi ini optional sih, w dulu bikin buat spacing)
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public SpacesItemDecoration(int space) {
        this.space = dpToPx(space);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);
        boolean isLast = (position == state.getItemCount()-1) || (position == state.getItemCount()-2);
        if (position % 4 == 0 || position % 4 == 3) {
            outRect.top = space;
            outRect.left = space;
            outRect.right = space / 2;
        } else {
            outRect.top = space;
            outRect.right = space;
            outRect.left = space / 2;
        }
        if (isLast) {
            outRect.bottom = space;
        }
    }

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }
}
