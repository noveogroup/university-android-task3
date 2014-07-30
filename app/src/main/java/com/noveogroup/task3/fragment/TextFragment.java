package com.noveogroup.task3.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.noveogroup.task3.R;

public final class TextFragment extends Fragment {

    public final static String TEXT_TO_PUT = "com.noveogroup.task3.TEXT_TO_PUT";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.text_fragment_layout, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text_view);
        textView.setText(getTextToPut());

        return view;
    }

    private String getTextToPut() {
        Bundle bundle = getArguments();
        return bundle == null ? null : bundle.getString(TEXT_TO_PUT);
    }

    public static TextFragment newInstance(String textToPut) {
        TextFragment newFragment = new TextFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TEXT_TO_PUT, textToPut);
        newFragment.setArguments(bundle);

        return newFragment;
    }
}
