package com.example.walkbookandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import net.daum.mf.map.api.MapView;

public class FragmentMap extends Fragment {
    Context mContext;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getActivity();

        View root = (ViewGroup) inflater.inflate(R.layout.fragment_map, container, false);
//        MapView mapView = new MapView(mContext);
//        ViewGroup mapViewContainer = (ViewGroup)root.findViewById(R.id.map_view);
//        mapViewContainer.addView(mapView);

        return root;
    }
}
