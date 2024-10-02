package marelias.holybible.ui.highlights;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import marelias.holybible.databinding.FragmentHighlightsBinding;

public class HighlightsFragment extends Fragment {

    private FragmentHighlightsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HighlightsViewModel highlightsViewModel =
                new ViewModelProvider(this).get(HighlightsViewModel.class);

        binding = FragmentHighlightsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHighlights;
        highlightsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}