package com.example.a0419_study;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.a0419_study.R;

public class HomeFragment extends Fragment implements OnBackPressedListener {
    MainActivity activity;
    long backKeyPressedTime;
    Toast toast;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        activity = (MainActivity) getActivity();
        toast = Toast.makeText(getContext(), "한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT);

        return root;
    }

    @Override
    public void onBackPressed() { //터치간 시간을 줄이거나 늘리고 싶다면 2000을 원하는 시간으로 변경해서 사용하시면 됩니다.
        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            toast.show();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 2000) {
            getActivity().finish();
            toast.cancel();
        }

    }

    @Override
    public void onResume() {
        super.onResume();
        activity.setOnBackPressedListener(this);
    }

}


