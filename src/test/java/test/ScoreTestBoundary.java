package test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @description:
 * @projectName:TestJUnit
 * @see:test
 * @author:SHUANG.LU
 * @createTime:2023/1/2 23:43
 * @version:1.0
 */
public class ScoreTestBoundary {
    @Test
    public void letterGrade1() {
        char c = Score.letterGrade(101);
        assertEquals('X',c);
    }
    @Test
    public void letterGrade2() {
        char c = Score.letterGrade(100);
        assertEquals('A',c);
    }
    @Test
    public void letterGrade3() {
        char c = Score.letterGrade(91);
        assertEquals('A',c);
    }
    @Test
    public void letterGrade4() {
        char c = Score.letterGrade(90);
        assertEquals('A',c);
    }
    @Test
    public void letterGrade5() {
        char c = Score.letterGrade(81);
        assertEquals('B',c);
    }
    @Test
    public void letterGrade6() {
        char c = Score.letterGrade(80);
        assertEquals('B',c);
    }
    @Test
    public void letterGrade7() {
        char c = Score.letterGrade(71);
        assertEquals('C',c);
    }
    @Test
    public void letterGrade8() {
        char c = Score.letterGrade(70);
        assertEquals('C',c);
    }
    @Test
    public void letterGrade9() {
        char c = Score.letterGrade(61);
        assertEquals('D',c);
    }
    @Test
    public void letterGrade10() {
        char c = Score.letterGrade(60);
        assertEquals('D',c);
    }
    @Test
    public void letterGrade11() {
        char c = Score.letterGrade(1);
        assertEquals('F',c);
    }
    @Test
    public void letterGrade12() {
        char c = Score.letterGrade(0);
        assertEquals('F',c);
    }
}