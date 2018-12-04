package com.example.alina.recyclerview;


import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class DataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    private List<Point> points;


    DataAdapter(List<Point> points) {
        this.points = new ArrayList<>( points );
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return VIEW_TYPE_HEADER;
        } else {
            return VIEW_TYPE_ITEM;
        }
    }

    @Override
    public int getItemCount() {
        return (points.size() + 1);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = null;
        RecyclerView.ViewHolder viewHolder = null;

        if (viewType == VIEW_TYPE_HEADER) {
            view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.empty, parent, false );
            viewHolder = new InvisibleHeaderViewHolder( view );
        } else {
            view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.my_list_item, parent, false );
            viewHolder = new VisibleItemViewHolderTwo( view );
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        if (holder.getItemViewType() == VIEW_TYPE_HEADER) {

        } else {
            if (holder.getItemViewType() == VIEW_TYPE_ITEM) {

                VisibleItemViewHolderTwo vaultItemHolder2 = (VisibleItemViewHolderTwo) holder;
                Point point = points.get( (position) - 1 );
                if (point.isAvailable()) {
                    vaultItemHolder2.imageView.setImageResource( R.drawable.free );
                    vaultItemHolder2.imageView1.setImageResource( R.drawable.free1 );
                } else {
                    vaultItemHolder2.imageView.setImageResource( R.drawable.engaged );
                    vaultItemHolder2.imageView1.setImageResource( R.drawable.engaged1 );
                }
                vaultItemHolder2.namePoint.setText( point.getName() );
                vaultItemHolder2.distanceView.setText( point.getDistance() );
            }
        }
    }

    static class InvisibleHeaderViewHolder extends RecyclerView.ViewHolder {

        public InvisibleHeaderViewHolder(View itemView) {
            super( itemView );
        }
    }


    static class VisibleItemViewHolderTwo extends RecyclerView.ViewHolder {
        public ImageView imageView, imageView1;
        public TextView namePoint, distanceView;

        public VisibleItemViewHolderTwo(View itemView) {
            super( itemView );
            imageView1 = (ImageView) itemView.findViewById( R.id.imageView_free11 );
            imageView = (ImageView) itemView.findViewById( R.id.imageView_free12 );
            namePoint = (TextView) itemView.findViewById( R.id.name_of_points );
            distanceView = (TextView) itemView.findViewById( R.id.distance );
            distanceView.setPaintFlags( distanceView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG );
        }
    }
}

