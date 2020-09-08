package com.example.a0419_study;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment {

    private RadioGroup rg_mode;
    private RadioButton rb_sound;
    private RadioButton rb_vib;
    private RadioButton rb_moo;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_settings, container, false);


        rg_mode = root.findViewById(R.id.radioGroup);
        rb_sound = root.findViewById(R.id.rg_btn1);
        rb_vib = root.findViewById(R.id.rg_btn2);
        rb_moo = root.findViewById(R.id.rg_btn3);

        rg_mode.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            AudioManager aManager = (AudioManager) getContext().getSystemService(Context.AUDIO_SERVICE);
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i == R.id.rg_btn1) {
                    aManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                    Toast.makeText(getContext(), "Sound mode", Toast.LENGTH_SHORT).show();
                }

                else if(i == R.id.rg_btn2) {
                    aManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                    Toast.makeText(getContext(), "Vibrate mode", Toast.LENGTH_SHORT).show();
                }
                else if(i == R.id.rg_btn3) {
                    aManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                    Toast.makeText(getContext(), "No Sound mode", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return root;
    }
}
