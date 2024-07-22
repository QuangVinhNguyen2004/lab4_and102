package com.example.luyentappager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {
    int soluong_tab = 2;
    TheLoai theLoai;
    SanPham sanPham;
    public PagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
        theLoai=new TheLoai();
        sanPham=new SanPham();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return  theLoai;
            case 1: return sanPham;
            default: return theLoai;
        }
    }

    @Override
    public int getItemCount() {
        return soluong_tab;
    }
}
