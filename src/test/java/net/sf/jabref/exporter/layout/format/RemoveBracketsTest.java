package net.sf.jabref.exporter.layout.format;

import net.sf.jabref.exporter.layout.LayoutFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveBracketsTest {
    private LayoutFormatter formatter;

    @Before
    public void setUp() {
        formatter = new RemoveBrackets();
    }

    @Test
    public void testFormat() throws Exception {
        assertEquals("some text", formatter.format("{some text}"));
        assertEquals("some text", formatter.format("{some text"));
        assertEquals("some text", formatter.format("some text}"));
        assertEquals("\\some text\\", formatter.format("\\{some text\\}"));
    }
}