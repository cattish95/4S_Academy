package com.example.a0419_study;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PhysioViewAdapter extends RecyclerView.Adapter<PhysioViewAdapter.Holder> {

    //팝업창
    private PopupWindow mPopupWindow;

    private Context context;
    private List<PhysioItemData> list = new ArrayList<>();

    public PhysioViewAdapter(Context context, List<PhysioItemData> list) {
        this.context = context;
        this.list = list;
    }

    // ViewHolder 생성
    // row layout을 화면에 뿌려주고 holder에 연결
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_physio_item, parent, false);
        Holder holder = new Holder(view);


        return holder;
    }

    /*
     * Todo 만들어진 ViewHolder에 data 삽입 ListView의 getView와 동일
     *
     * */
    @Override
    public void onBindViewHolder(final Holder holder, int position) {
        // 각 위치에 문자열 세팅
        int itemposition = position;
        holder.wordText.setText(list.get(itemposition).word);
        Log.d(getClass().getSimpleName(), "onBindViewHolder" + itemposition);

        //아이템 누르면 팝업
        switch(itemposition) {
            case 0:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = (new Intent(Intent.ACTION_VIEW)
                                .setData(Uri.parse("https://www.youtube.com/watch?v=VVZMFjk6S-w")) // edit this url
                                .setPackage("com.google.android.youtube"));
                        ((Activity) context).startActivity(intent);
                    }
                });
                break;

            case 1:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = (new Intent(Intent.ACTION_VIEW)
                                .setData(Uri.parse("https://www.youtube.com/watch?v=mjqPNYRNRn8&t=122s")) // edit this url
                                .setPackage("com.google.android.youtube"));
                        ((Activity) context).startActivity(intent);
                    }
                });
                break;

            case 2:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = (new Intent(Intent.ACTION_VIEW)
                            .setData(Uri.parse("https://www.youtube.com/watch?v=y9_nvKWZNOs")) // edit this url
                            .setPackage("com.google.android.youtube"));
                    ((Activity) context).startActivity(intent);
                }
            });
            break;

            case 3:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = (new Intent(Intent.ACTION_VIEW)
                                .setData(Uri.parse("https://www.youtube.com/watch?v=9gM2zNDNP6A&t=4s")) // edit this url
                                .setPackage("com.google.android.youtube"));
                        ((Activity) context).startActivity(intent);
                    }
                });
                break;

            case 4:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = (new Intent(Intent.ACTION_VIEW)
                                .setData(Uri.parse("https://www.youtube.com/watch?v=PvA7TP7rcQs")) // edit this url
                                .setPackage("com.google.android.youtube"));
                        ((Activity) context).startActivity(intent);
                    }
                });
                break;

            default:
                break;
        }
    }



    // 몇개의 데이터를 리스트로 뿌려줘야하는지 반드시 정의해줘야한다
    @Override
    public int getItemCount() {
        return list.size();
        // RecyclerView의 size return
    }

    // ViewHolder는 하나의 View를 보존하는 역할을 한다
    public class Holder extends RecyclerView.ViewHolder {
        public TextView wordText;

        public Holder(View view) {
            super(view);
            wordText = (TextView) view.findViewById(R.id.tv_physio);
        }
    }
}
