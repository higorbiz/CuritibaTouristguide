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
public class TourFragment extends Fragment {


    private static final String TAG = TourFragment.class.getSimpleName();

    public TourFragment() {
        // Required empty public constructor
    }


    @Override
    public String toString() {
        return "TourFragment{}";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.curitiba_list, container, false);

        ArrayList<Local> curitibas = new ArrayList<Local>();

            curitibas.add(new Local(getResources().getString(R.string.turismo_header), ContextCompat.getDrawable(getContext(), R.drawable.linha_turismo_2), getResources().getString(R.string.bus_tour_description)));
            curitibas.add(new Local(getResources().getString(R.string.serra_verde_header), ContextCompat.getDrawable(getContext(), R.drawable.serra_verde_express), getResources().getString(R.string.serra_verde_express_description)));
            curitibas.add(new Local(getResources().getString(R.string.kuritibike_header), ContextCompat.getDrawable(getContext(), R.drawable.kuritibike), getResources().getString(R.string.kuritBike_cicloturismo_urbano)));

        LocalAdapter adapter = new LocalAdapter(getActivity(), curitibas);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }


}
