package com.example.instrumentalapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MusicZoneFragment extends Fragment {
    ImageView piano;
    ImageView drumpad;
    ImageView guitar;
    ImageView xylophone;

    public MusicZoneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music_zone, container, false);

        piano = view.findViewById(R.id.piano_img);
        drumpad = view.findViewById(R.id.drumpad_img);
        guitar = view.findViewById(R.id.guitar);
        xylophone = view.findViewById(R.id.xylophone);

        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent piano = new Intent(getContext(), PianoActivity.class);
                startActivity(piano);
            }
        });
        drumpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drumpad = new Intent(getContext(), DrumPadActivity.class);
                startActivity(drumpad);
            }
        });

        guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent guitar = new Intent(getContext(), GuitarActivity.class);
                startActivity(guitar);
            }
        });

        xylophone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xylophone = new Intent(getContext(), XylophoneActivity.class);
                startActivity(xylophone);
            }
        });

        return view;
    }
}