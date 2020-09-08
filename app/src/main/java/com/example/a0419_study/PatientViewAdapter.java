package com.example.a0419_study;

import android.content.Context;
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

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PatientViewAdapter extends RecyclerView.Adapter<PatientViewAdapter.Holder> {
    //팝업창
    private PopupWindow mPopupWindow ;

    private Context context;
    private List<PatientItemData> list = new ArrayList<>();

    public PatientViewAdapter(Context context, List<PatientItemData> list) {
        this.context = context;
        this.list = list;
    }

    // ViewHolder 생성
    // row layout을 화면에 뿌려주고 holder에 연결
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_patient_item, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    /*
     * Todo 만들어진 ViewHolder에 data 삽입 ListView의 getView와 동일
     *
     * */
    @Override
    public void onBindViewHolder(final Holder holder, final int position) {
        // 각 위치에 문자열 세팅
        int itemposition = position;
        holder.wordText.setText(list.get(itemposition).word);
        holder.meaningText.setText(list.get(itemposition).meaning);
        Log.d(getClass().getSimpleName(), "onBindViewHolder" + itemposition);

        //아이템 누르면 팝업
        switch(itemposition) {
            case 0:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    View popupView = LayoutInflater.from(v.getContext()).inflate(R.layout.pat_popup_1,
                            (ViewGroup) v, false);

                    mPopupWindow = new PopupWindow(popupView, LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);
                    //popupView 에서 (LinearLayout 을 사용) 레이아웃이 둘러싸고 있는 컨텐츠의 크기 만큼 팝업 크기를 지정
                    mPopupWindow.setFocusable(true);
                    // 외부 영역 선택히 PopUp 종료
                    mPopupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);

                    //팝업창 내 버튼 클릭리스너
                    Button ok = (Button) popupView.findViewById(R.id.patient_btn1);
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mPopupWindow.dismiss();
                        }
                    });

                }
            });
            break;

            case 1:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        View popupView = LayoutInflater.from(v.getContext()).inflate(R.layout.pat_popup_2,
                                (ViewGroup) v, false);

                        mPopupWindow = new PopupWindow(popupView, LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                        mPopupWindow.setFocusable(true);
                        mPopupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);

                        Button ok = (Button) popupView.findViewById(R.id.patient_btn2);
                        ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mPopupWindow.dismiss();
                            }
                        });
                    }
                });
                break;

            case 2:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        View popupView = LayoutInflater.from(v.getContext()).inflate(R.layout.pat_popup_3,
                                (ViewGroup) v, false);

                        mPopupWindow = new PopupWindow(popupView, LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                        mPopupWindow.setFocusable(true);
                        mPopupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);

                        Button ok = (Button) popupView.findViewById(R.id.patient_btn3);
                        ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mPopupWindow.dismiss();
                            }
                        });
                    }
                });
                break;

            case 3:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        View popupView = LayoutInflater.from(v.getContext()).inflate(R.layout.pat_popup_4,
                                (ViewGroup) v, false);

                        mPopupWindow = new PopupWindow(popupView, LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                        mPopupWindow.setFocusable(true);
                        mPopupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);

                        Button ok = (Button) popupView.findViewById(R.id.patient_btn4);
                        ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mPopupWindow.dismiss();
                            }
                        });
                    }
                });
                break;

            case 4:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        View popupView = LayoutInflater.from(v.getContext()).inflate(R.layout.pat_popup_5,
                                (ViewGroup) v, false);

                        mPopupWindow = new PopupWindow(popupView, LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                        mPopupWindow.setFocusable(true);
                        mPopupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);

                        Button ok = (Button) popupView.findViewById(R.id.patient_btn5);
                        ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mPopupWindow.dismiss();
                            }
                        });
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
        return list.size(); // RecyclerView의 size return
    }

    // ViewHolder는 하나의 View를 보존하는 역할을 한다
    public class Holder extends RecyclerView.ViewHolder{
        public TextView wordText;
        public TextView meaningText;

        public Holder(View view){
            super(view);
            wordText = (TextView) view.findViewById(R.id.wordText);
            meaningText = (TextView) view.findViewById(R.id.meaningText);
        }
    }
}