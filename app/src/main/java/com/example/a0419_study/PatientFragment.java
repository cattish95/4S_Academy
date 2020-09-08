package com.example.a0419_study;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PatientFragment extends Fragment{

    private RecyclerView recyclerView;
    private PatientViewAdapter adapter;
    private ArrayList<PatientItemData> list = new ArrayList<>();
    MainActivity activity;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_patient, container, false);
        recyclerView = (RecyclerView) root.findViewById(R.id.reView_patient);
        activity = (MainActivity)getActivity();

        //생성될 리스트 갯수 정의
        list = PatientItemData.createContactsList(5);

        recyclerView.setHasFixedSize(true);
        adapter = new PatientViewAdapter(getActivity(), list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        Log.d("PatientFrag", "MainFragment");

        return root;
    }

}


