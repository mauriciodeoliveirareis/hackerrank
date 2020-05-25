import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {

    @Test
    void emptyStringWithSpaceShouldReturnEmpty() {
        assertEquals("",Encryption.encryption(" "));
    }
    @Test
    void twoCharacterStringWithoutSpaceShouldReturnOnlyTwoCharacterWithSpace() {
        assertEquals("a b",Encryption.encryption("ab"));
    }
    @Test
    void twoCharacterStringWithSpaceShouldAlsoReturnTwoCharacterWithSpace() {
        assertEquals("a b",Encryption.encryption("a b"));
    }

    @Test
    void heyaShouldReturnHy_ea() {
        assertEquals("hy ea",Encryption.encryption("heya"));
    }

    @Test
    void haveaniceday() {
        assertEquals("hae and via ecy",Encryption.encryption("haveaniceday"));
    }

    @Test
    void feedthedog() {
        assertEquals("fto ehg ee dd",Encryption.encryption("feedthedog"));
    }

    @Test
    void chillout() {
        assertEquals("clu hlt io",Encryption.encryption("chillout"));
    }


}