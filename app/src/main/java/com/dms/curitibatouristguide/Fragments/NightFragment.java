package com.dms.curitibatouristguide.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.dms.curitibatouristguide.Adapters.LocalAdapter;
import com.dms.curitibatouristguide.Local;
import com.dms.curitibatouristguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NightFragment extends Fragment {


    public NightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.curitiba_list, container, false);

        ArrayList<Local> curitibas = new ArrayList<Local>();

        curitibas.add(new Local(getResources().getString(R.string.hard_rock_header), ContextCompat.getDrawable(getContext(), R.drawable.hard_rock), getResources().getString(R.string.hard_rock)));
        curitibas.add(new Local(getResources().getString(R.string.shed_header), ContextCompat.getDrawable(getContext(),R.drawable.shed_bar), getResources().getString(R.string.shed)));
        curitibas.add(new Local(getResources().getString(R.string.taco_header), ContextCompat.getDrawable(getContext(), R.drawable.taco), getResources().getString(R.string.taco)));

        LocalAdapter adapter = new LocalAdapter(getActivity(), curitibas);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}
