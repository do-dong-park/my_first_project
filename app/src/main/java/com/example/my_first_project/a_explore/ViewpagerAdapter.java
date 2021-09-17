package com.example.my_first_project.a_explore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewpagerAdapter extends FragmentPagerAdapter {

//    fragmet의 배열 / 제목의 배열 객체 설정
    private ArrayList<Fragment> arrayList = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();

//    adapter 객체가 생성 되었을 때, 배열값 초기화.
    public ViewpagerAdapter(@NonNull FragmentManager fm) {

        super(fm);

        arrayList.add(new FragmentOne());
        arrayList.add(new FragmentTwo());
        arrayList.add(new FragmentThree());
        arrayList.add(new FragmentFour());

        name.add("1번 탭");
        name.add("2번 탭");
        name.add("3번 탭");
        name.add("4번 탭");
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return name.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
}
