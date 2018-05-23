package net.gusri.tabs3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import net.gusri.pancasila.R;



public class Sila3cFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_tab3, container, false);

        final WebView mWb = (WebView) mView.findViewById(R.id.wv_Tab3);
        mWb.loadUrl("file:///android_asset/web/sila3/pagebutirC.html");
        mWb.getSettings().setJavaScriptEnabled(true);

        return mView;
    }
}