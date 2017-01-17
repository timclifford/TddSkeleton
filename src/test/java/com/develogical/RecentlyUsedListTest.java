package com.develogical;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ape05 on 17/01/2017.
 */
public class RecentlyUsedListTest {
    RecentlyUsedList recentlyUsedList;
    @Before
    public void init() {
        recentlyUsedList = new RecentlyUsedList();
    }

    @After
    public void tearDown() {
        recentlyUsedList = null;
    }

    @Test
    public void testListIsEmpty() {
        Assert.assertEquals(true, recentlyUsedList.isEmpty());
    }

    @Test
    public void addOneItemToList() {
        recentlyUsedList.add(1);
        Assert.assertEquals(1, recentlyUsedList.get(0));
    }

    @Test
    public void testGetMostRecentItem() {
        recentlyUsedList.add(2);
        recentlyUsedList.add(5);
        Assert.assertEquals(5, recentlyUsedList.get(0));
        Assert.assertEquals(2, recentlyUsedList.get(1));
    }

    @Test
    public void itemsAreUnique() {
        recentlyUsedList.add(5);
        recentlyUsedList.add(5);
        Assert.assertEquals(5, recentlyUsedList.get(0));
        Assert.assertEquals(1, recentlyUsedList.count());
    }
}
