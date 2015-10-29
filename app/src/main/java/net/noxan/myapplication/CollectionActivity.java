package net.noxan.myapplication;

import android.os.Bundle;

public class CollectionActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
    }

    public int getActiveNavigationItem() {
        return R.id.nav_gallery;
    }
}
