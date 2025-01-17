package com.example.safehopper.ui.addContact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.safehopper.R;

public class AddContactFragment extends Fragment {

    private AddContactViewModel addContactViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addContactViewModel =
                ViewModelProviders.of(this).get(AddContactViewModel.class);
        View root = inflater.inflate(R.layout.fragment_add_contact, container, false);
//        final TextView textView = root.findViewById(R.id.textView2);
//        addContactViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}