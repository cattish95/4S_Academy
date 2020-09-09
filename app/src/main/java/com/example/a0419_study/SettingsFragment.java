package com.example.a0419_study;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class SettingsFragment extends Fragment {

    private RadioGroup rg_mode;
    private RadioButton rb_sound;
    private RadioButton rb_vib;
    private RadioButton rb_moo;
    private Button btn_edit;
    private EditText et_R, et_G, et_B;
    private Integer a, b, c;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_settings, container, false);

        rg_mode = root.findViewById(R.id.radioGroup);
        rb_sound = root.findViewById(R.id.rg_btn1);
        rb_vib = root.findViewById(R.id.rg_btn2);
        rb_moo = root.findViewById(R.id.rg_btn3);
        rb_sound.setChecked(true);

        btn_edit = root.findViewById(R.id.btn_editRGB);
        et_R = root.findViewById(R.id.et1);
        et_G = root.findViewById(R.id.et2);
        et_B = root.findViewById(R.id.et3);
        et_R.setText("0"); et_G.setText("0"); et_B.setText("0");

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

        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity activity = getActivity();
                a = Integer.parseInt("" + et_R.getText());
                b = Integer.parseInt("" + et_G.getText());
                c = Integer.parseInt("" + et_B.getText());
                if(a>128 || b>128 || c>128 || a<0 || b<0 || c<0)
                    Toast.makeText(v.getContext(), "0에서 128까지의 숫자를 입력해주세요.", Toast.LENGTH_SHORT).show();
                else if(activity != null) {
                    ((MainActivity) activity).setActionBarRGB(a, b, c);
                }
                else {
                    ((MainActivity) activity).setActionBarRGB(a, b, c);
                }
            }
        });

        return root;
    }

//    @Override
//    public void onResume() {
//        super.onResume();
//        FragmentActivity activity = getActivity();
//        if (activity != null) {
//            ((MainActivity) activity).setActionBarRGB(0,0,128);
//        }
//    }
}
