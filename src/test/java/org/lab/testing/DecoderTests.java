package org.lab.testing;
import org.lab.Decoder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoderTests {
    @Test
    public void testDecodeVowelReplacement() {
        assertEquals("testing", Decoder.decodeVowelReplacement("t2st3ng"));
    }

    @Test
    public void testDecodeConsonantReplacement() {
        assertEquals("testing", Decoder.decodeConsonantReplacement("uftujoh"));
    }

    @Test
    public void testDecodeMessage() {
        assertEquals("hi there", Decoder.decodeMessage("h3 th2r2"));
        assertEquals("hello", Decoder.decodeMessage("ifmmp"));
        assertEquals("hi there hello", Decoder.decodeMessage("h3 th2r2 ifmmp"));
        assertEquals("testing testing", Decoder.decodeMessage("t2st3ng uftujoh"));
    }
}
