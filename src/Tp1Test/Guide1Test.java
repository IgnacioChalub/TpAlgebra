package Tp1Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import Tp1.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Guide1Test extends SkipRule {
    private Guide1 guide1;

    public Guide1Test(Guide1 guide) {
        guide1 = guide;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Guide1> parameters() {
        return new ArrayList(Arrays.asList(new Guide1IterativeSolution(), new Guide1RecursiveSolution()));
    }

    @Test
    public void exercise_1_f() {
        Assert.assertEquals(0, guide1.exercise_1_f(0));
        Assert.assertEquals(1, guide1.exercise_1_f(1));
        Assert.assertEquals(9, guide1.exercise_1_f(2));
        Assert.assertEquals(36, guide1.exercise_1_f(3));
        Assert.assertEquals(100, guide1.exercise_1_f(4));
        Assert.assertEquals(225, guide1.exercise_1_f(5));
        Assert.assertEquals(441, guide1.exercise_1_f(6));
        Assert.assertEquals(646430625, guide1.exercise_1_f(225));
    }

    @Test
    public void exercise_2_a() {
        Assert.assertEquals(1, guide1.exercise_2_a(0));
        Assert.assertEquals(1, guide1.exercise_2_a(1));
        Assert.assertEquals(2, guide1.exercise_2_a(2));
        Assert.assertEquals(6, guide1.exercise_2_a(3));
        Assert.assertEquals(24, guide1.exercise_2_a(4));
        Assert.assertEquals(479001600, guide1.exercise_2_a(12));
    }

    @Test
    public void exercise_3() {
        Assert.assertEquals(0, guide1.exercise_3(1));
        Assert.assertEquals(1, guide1.exercise_3(10));
        Assert.assertEquals(2, guide1.exercise_3(93020));
        Assert.assertEquals(3, guide1.exercise_3(3012100));
        Assert.assertEquals(8, guide1.exercise_3(200000000));
        Assert.assertEquals(4, guide1.exercise_3(20202020));
        Assert.assertEquals(0, guide1.exercise_3(1989));
    }

   @Test
    public void exercise_6_b_i() {
        assertTrue(guide1.exercise_6_b_i(2));
        assertTrue(guide1.exercise_6_b_i(3));
        assertTrue(guide1.exercise_6_b_i(5));
        assertTrue(guide1.exercise_6_b_i(7));
        assertTrue(guide1.exercise_6_b_i(11));
        assertTrue(guide1.exercise_6_b_i(13));
        assertFalse(guide1.exercise_6_b_i(4));
        assertFalse(guide1.exercise_6_b_i(8));
        assertFalse(guide1.exercise_6_b_i(9));
        assertFalse(guide1.exercise_6_b_i(10));
        assertFalse(guide1.exercise_6_b_i(12));
        assertFalse(guide1.exercise_6_b_i(14));
    }

    @Test
    public void exercise_8() {
        Assert.assertEquals(340, guide1.exercise_8(new int[]{1, 8, 5, 10}, 3));
        Assert.assertEquals(117, guide1.exercise_8(new int[]{1, 8, 5, 10}, 2));
        Assert.assertEquals(24, guide1.exercise_8(new int[]{1, 8, 5, 10}, 1));
        Assert.assertEquals(1, guide1.exercise_8(new int[]{1, 8, 5, 10}, 0));
    }

}