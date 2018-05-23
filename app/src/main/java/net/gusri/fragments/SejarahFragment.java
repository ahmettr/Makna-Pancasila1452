package net.gusri.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import net.gusri.pancasila.R;



public class SejarahFragment extends Fragment {
    private ImageView mGambar;
    private TextView mKeterangan;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Sign SejarahFragment ke Fragment_sejarah
        View mView = inflater.inflate(R.layout.fragment_sejarah, container, false);



        mKeterangan = (TextView) mView.findViewById(R.id.txt_ketBPUPKI);
        mKeterangan.setText("1");


        final WebView mWb = (WebView) mView.findViewById(R.id.wv_sejarah);
        mWb.loadUrl("file:///android_asset/web/pagesejarah.html");
        mWb.getSettings().setJavaScriptEnabled(true);
        return mView;
    }
}


