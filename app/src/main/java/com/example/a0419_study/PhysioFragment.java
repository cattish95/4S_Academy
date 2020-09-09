package com.example.a0419_study;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PhysioFragment extends Fragment{

    private RecyclerView recyclerView;
    private PhysioViewAdapter adapter;
    private ArrayList<PhysioItemData> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_physio, container, false);

        recyclerView = (RecyclerView) root.findViewById(R.id.reView_physio);

        list = PhysioItemData.createContactsList(5);
        recyclerView.setHasFixedSize(true);
        adapter = new PhysioViewAdapter(getActivity(), list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        Log.d("PhysioFrag", "MainFragment");

        return root;
    }
}
