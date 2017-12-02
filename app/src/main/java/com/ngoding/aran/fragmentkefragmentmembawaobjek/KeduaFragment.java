package com.ngoding.aran.fragmentkefragmentmembawaobjek;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class KeduaFragment extends Fragment {
    public static String EXTRA_PERMINTAAN_DATA = "extra_permintaan_data";
    public TextView tvTampilDataObjek;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kedua, container, false);
        tvTampilDataObjek = view.findViewById(R.id.tv_tampil_data_objek);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String dataObejekDiterima = getArguments().getString(EXTRA_PERMINTAAN_DATA);
        tvTampilDataObjek.setText(dataObejekDiterima);
    }
}
