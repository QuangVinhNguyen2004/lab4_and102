package com.example.luyentappager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragCollection extends Fragment {
    ViewPager2 pager01;
    TabLayout tablayout01;
    PagerAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_conllection,container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // ánh xạ
        pager01 = view.findViewById(R.id.pager01);
        tablayout01 = view.findViewById(R.id.tablayout01);
// tạo adapter
        adapter = new PagerAdapter(this);
// gắn adapter cho viewpager
        pager01.setAdapter( adapter );
        //hiển thị tab
        TabLayoutMediator mediator=new TabLayoutMediator(tablayout01, pager01, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Thể loại");
                        tab.setIcon(R.drawable.baseline_bookmark_add_24);
                        break;
                    case 1:
                        tab.setText("Sản phẩm");
                        tab.setIcon(R.drawable.baseline_bookmark_add_24);
                        break;
                }
            }
        });
        //k quên attack
        mediator.attach();
    }
}
