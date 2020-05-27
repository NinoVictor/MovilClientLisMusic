package com.uv.lismusicjava.ui.library;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uv.lismusicjava.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArtistLibraryFragment extends Fragment {

    public ArtistLibraryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artist_library, container, false);
    }
}
