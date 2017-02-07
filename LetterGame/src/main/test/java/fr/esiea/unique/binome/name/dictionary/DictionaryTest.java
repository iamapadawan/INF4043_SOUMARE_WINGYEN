package fr.esiea.unique.binome.name.dictionary;

import org.junit.Before;

import com.sun.xml.internal.ws.policy.AssertionSet;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Unit test sample for Dictionary.
 */
public class DictionaryTest {

    private IDictionary dictionary;

    @Before
    public void setup() {
        //TODO
    }

    @Test
    public void testIsWord() {
        Assertions.assertThat(dictionary.isWord("maman"));
//        assertTrue(dictionary.isWord("maman"));
        assertFalse(dictionary.isWord("namam"));
    }
}
