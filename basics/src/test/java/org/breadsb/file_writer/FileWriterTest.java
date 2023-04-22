package org.breadsb.file_writer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileWriterTest {

    @Test
    void test1() {
        FileXLS fileXLS = new FileXLS("myNewFileName");
        Assertions.assertFalse(fileXLS.getFileName().isBlank());
        Assertions.assertEquals(".xls",fileXLS.extensionFile());
        Assertions.assertNull(fileXLS.getExtension());
    }

    @Test
    void test2() {
        FileXLS fileXLS = new FileXLS("myNewFileName", "SimpleDescription");
        Assertions.assertFalse(fileXLS.getFileName().isBlank());
        Assertions.assertEquals(".xls",fileXLS.extensionFile());
        Assertions.assertEquals(".xls", fileXLS.getExtension());
        Assertions.assertEquals("SimpleDescription", fileXLS.getDescription());
    }
}
