package com.android.hovo.beatbox;

import android.support.v4.app.Fragment;
import com.android.hovo.beatbox.Fragments.BeatBoxFragment;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
