package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void readNullFromPropertyTest() {
        String value = System.getProperty("our_property");

        System.out.println(value);
        //null
    }

    @Test
    void setAndReadFromPropertyTest() {
        System.setProperty("our_property", "communism");
        String value = System.getProperty("our_property");

        System.out.println(value);
        //communism
    }

    @Test
    void readDefaultFromPropertyTest() {
        String value = System.getProperty("our_property", "democracy");

        System.out.println(value);
        //democracy
    }

    @Test
    void readAndSetDefaultFromPropertyTest() {
        System.setProperty("our_property", "communism");
        String value = System.getProperty("our_property", "democracy");

        System.out.println(value);
        //communism
    }

    @Test
    void readWithGradleFromPropertyTest() {
        String value = System.getProperty("browser", "chrome");

        System.out.println(value);
        //opera
    }

    @Test
    @Tag("terminal")
    void readWithTerminalFromPropertyTest() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");

        System.out.println(browser);
        System.out.println(version);
        // gradle clean some_run
        // opera
        // 91

        // gradle clean some_run -Dbrowser=safari
        // safari
        // 91

        // gradle clean some_run -Dbrowser=safari -Dversion=89
        // safari
        // 89
    }

}
