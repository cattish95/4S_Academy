package com.example.a0419_study;

import java.util.ArrayList;

public class PatientItemData {
    public String word;
    public String meaning;

    // 화면에 표시될 문자열 초기화
    public PatientItemData(String word, String meaning) { //   ,String meaning
        this.word = word;
        this.meaning = meaning;
    }

    // 입력받은 숫자의 리스트생성
    public static ArrayList<PatientItemData> createContactsList(int numContacts) {
        ArrayList<PatientItemData> contacts = new ArrayList<PatientItemData>();

//        for (int i = 1; i <= numContacts; i++) {
//            //리스트 제목 입력
//            contacts.add(new PatientItemData());
//        }
        contacts.add(new PatientItemData("자 세 교 정","(비둘기자세)"));
        contacts.add(new PatientItemData("자 세 교 정","(화환자세)"));
        contacts.add(new PatientItemData("자 세 교 정","(소머리자세)"));
        contacts.add(new PatientItemData("자 세 교 정","(다리걸쳐당기기)"));
        contacts.add(new PatientItemData("자 세 교 정","(개구리자세)"));

        return contacts;
    }
}
