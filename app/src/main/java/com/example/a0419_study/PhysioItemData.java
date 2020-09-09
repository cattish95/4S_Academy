package com.example.a0419_study;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class PhysioItemData {
    public String word;

    // 화면에 표시될 문자열 초기화
    public PhysioItemData(String word) {
        this.word = word;
    }

    // 입력받은 숫자의 리스트생성
    public static ArrayList<PhysioItemData> createContactsList(int numContacts) {
        ArrayList<PhysioItemData> contacts = new ArrayList<PhysioItemData>();

        contacts.add(new PhysioItemData("권도수 소개"));
        contacts.add(new PhysioItemData("물리치료사 공감"));
        contacts.add(new PhysioItemData("슬링 정리법"));
        contacts.add(new PhysioItemData("오십견 교육"));
        contacts.add(new PhysioItemData("오십견 홈프로그램"));


        return contacts;
    }
}
