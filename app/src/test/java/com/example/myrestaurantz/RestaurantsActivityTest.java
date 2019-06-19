package com.example.myrestaurantz;


import android.widget.ListView;

import com.example.myrestaurantz.ui.RestaurantsActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)

public class RestaurantsActivityTest {
    private RestaurantsActivity activity;
    private ListView mRestaurantListView;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(RestaurantsActivity.class);
        mRestaurantListView = (ListView) activity.findViewById(R.id.listView);
    }
    @Test
    public void setmRestaurantListViewPopulates() {
        assertNotNull(mRestaurantListView.getAdapter());
        assertEquals(mRestaurantListView.getAdapter().getCount(), 15);
    }
}
