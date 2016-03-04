package com.bigneardranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Spencer on 3/2/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
