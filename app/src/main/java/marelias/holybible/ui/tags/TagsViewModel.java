package marelias.holybible.ui.tags;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TagsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TagsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Here are the tags");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
