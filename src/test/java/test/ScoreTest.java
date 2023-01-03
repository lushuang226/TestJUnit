package test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @description:
 * @projectName:TestJUnit
 * @see:test
 * @author:SHUANG.LU
 * @createTime:2023/1/2 19:30
 * @version:1.0
 */
public class ScoreTest {

    @Test
    public void letterGrade01() {
        char c = Score.letterGrade(101);
        assertEquals('X',c);
    }
    @Test
    public void letterGrade02() {
        char c = Score.letterGrade(95);
        assertEquals('A',c);
    }
    @Test
    public void letterGrade03() {
        char c = Score.letterGrade(85);
        assertEquals('B',c);
    }
    @Test
    public void letterGrade04() {
        char c = Score.letterGrade(75);
        assertEquals('C',c);
    }
    @Test
    public void letterGrade05() {
        char c = Score.letterGrade(65);
        assertEquals('D',c);
    }
    @Test
    public void letterGrade06() {
        char c = Score.letterGrade(55);
        assertEquals('F',c);
    }
    @Test
    public void letterGrade07() {
        char c = Score.letterGrade(-1);
        assertEquals('X',c);
    }
}