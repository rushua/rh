package com.rush.rainyhills.core;

import com.rush.rainyhills.TestItemUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Ruslan Khalikov
 * Date: 14.06.2016
 * Time: 21:09
 */
public class VolumeCalculatorTest {

    private TestItemUtil.TestItem[] items;
    private VolumeCalculator volumeCalculator;

    @Before
    public void init() {
        items = TestItemUtil.createTestItems();
        volumeCalculator = new VolumeCalculator();
        volumeCalculator.setVolumeCalculator(new RecursionCalculator());
    }

    @Test
    public void fullCalculateTest() {
        Arrays.stream(items).forEach(
                item -> Assert.assertEquals("Failed: " + item, item.getVolume(), volumeCalculator.calculate(item.getHills()))
        );
    }

    @Ignore
    @Test
    public void partCalculateTest() {
        TestItemUtil.TestItem item = items[28];
        Assert.assertEquals("Failed: " + item, item.getVolume(), volumeCalculator.calculate(item.getHills()));
    }
}
