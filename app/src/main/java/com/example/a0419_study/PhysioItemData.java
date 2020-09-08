package com.example.a0419_study;

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

        contacts.add(new PhysioItemData(""));
        contacts.add(new PhysioItemData(""));
        contacts.add(new PhysioItemData(""));
        contacts.add(new PhysioItemData(""));
        contacts.add(new PhysioItemData(""));
        contacts.add(new PhysioItemData(""));
        contacts.add(new PhysioItemData(""));
        contacts.add(new PhysioItemData(""));
        contacts.add(new PhysioItemData(""));



        return contacts;
    }
}
