package id.ac.polinema.fashionshop.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.ac.polinema.fashionshop.Activities.ShopFashion;
import id.ac.polinema.fashionshop.R;


public class JumlahtotalFragment extends Fragment {

    View view;
    ShopFashion items;

    public JumlahtotalFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_jumlahtotal, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textData);
        Bundle data = this.getArguments();

        items = data.getParcelable("shop");
        String dat = items.getNama()+" Total biaya anda "+items.getJumlah();
        textView.setText(dat);

        return  view;
    }
}
