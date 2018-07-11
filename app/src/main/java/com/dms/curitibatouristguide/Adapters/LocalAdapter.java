package com.dms.curitibatouristguide.Adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dms.curitibatouristguide.Local;
import com.dms.curitibatouristguide.R;

import java.util.ArrayList;

public class LocalAdapter extends ArrayAdapter<Local> {


    public LocalAdapter(Activity context, ArrayList<Local> curitiba) {
        super(context,0, curitiba);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Local currentWordPosition = getItem(position);


        //set the header
        TextView header = listItemView.findViewById(R.id.header);
        header.setText(currentWordPosition.getHeader());

        // set image
        ImageView imageView = listItemView.findViewById(R.id.imageId);
        imageView.setImageDrawable(currentWordPosition.getmImage());

        //set the description
        TextView desctipton = listItemView.findViewById(R.id.description);
        desctipton.setText(currentWordPosition.getmDescription());


        return listItemView;
    }
}
