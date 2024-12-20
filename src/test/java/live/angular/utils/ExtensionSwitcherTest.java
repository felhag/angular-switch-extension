package live.angular.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtensionSwitcherTest {
    final ExtensionSwitcher switcher = new ExtensionSwitcher(null);

    @Test
    void getExtension() {
        assertEquals("spec.ts", switcher.getExtension("a.component.spec.ts"));
        assertEquals("ts", switcher.getExtension("a.component.ts"));
        assertEquals("", switcher.getExtension("ats"));
    }

    @Test
    void getNameWithoutExtension() {
        assertEquals("/home/a", switcher.getNameWithoutExtension("/home/a.spec.ts"));
        assertEquals("a", switcher.getNameWithoutExtension("a.ts"));
        assertEquals("ats", switcher.getNameWithoutExtension("ats"));
    }
}
