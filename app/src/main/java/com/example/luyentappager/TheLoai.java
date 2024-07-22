package com.example.luyentappager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.luyentappager.Adapter.CatAdapter;
import com.example.luyentappager.DTO.CatDTO;

import java.util.ArrayList;

public class TheLoai extends Fragment {
    RecyclerView rc_cat;
    EditText txtTL;
    ArrayList<CatDTO> listCat=new ArrayList<>();
    CatAdapter catAdapter;
    Button Them;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.frag_the_loai,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rc_cat=view.findViewById(R.id.rc_cat);
        Them=view.findViewById(R.id.btnThemTL);
        txtTL=view.findViewById(R.id.txtNhapTen);
        listCat.add(new CatDTO("Văn học"));
        listCat.add(new CatDTO("Văn học"));
        catAdapter=new CatAdapter(listCat,requireContext());
        rc_cat.setAdapter(catAdapter);
        catAdapter.notifyDataSetChanged();
        Them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ThemTL=txtTL.getText().toString();
                listCat.add(new CatDTO(ThemTL));
                catAdapter.notifyDataSetChanged();
            }
        });
        catAdapter.notifyDataSetChanged();
    }
}
