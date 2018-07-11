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
public class PointsFragment extends Fragment {


    public PointsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.curitiba_list, container, false);

        ArrayList<Local> curitibas = new ArrayList<Local>();

        curitibas.add(new Local(getResources().getString(R.string.mon_header), ContextCompat.getDrawable(getContext(),R.drawable.museu_oscar_niemeyer), getResources().getString(R.string.museu_oscar)));
        curitibas.add(new Local(getResources().getString(R.string.botanico_header), ContextCompat.getDrawable(getContext(),R.drawable.jardim_botanico), getResources().getString(R.string.jardin_botanico)));
        curitibas.add(new Local(getResources().getString(R.string.holocausto_header), ContextCompat.getDrawable(getContext(),R.drawable.museu_holocausto), getResources().getString(R.string.museu_holocausto)));

        LocalAdapter adapter = new LocalAdapter(getActivity(), curitibas);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
