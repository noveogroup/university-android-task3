package com.noveogroup.task3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        view.findViewById(R.id.simple_actionbar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SimpleActionBar.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.simple_actionbar_with_upbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActionBarWithUpButton.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.split_action_bar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SplitActionBar.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.actionbar_with_tabs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActionBarWithTabs.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.actionbar_with_navigation_list).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActionBarWithNavigationList.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.actionbar_with_custom_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActionBarWithCustomView.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.actionbar_with_custom_theme).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActionBarWithCustomTheme.class);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.actionbar_with_action_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActionBarWithActionView.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
