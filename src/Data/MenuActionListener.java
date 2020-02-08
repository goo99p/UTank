package Data;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MenuActionListener extends KeyAdapter {
    boolean key1, key2, key3,
            escape;

    public void keyPressed(KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.VK_P:
                key1 = true;
                break;
            case KeyEvent.VK_S:
                key2 = true;
                break;
            case KeyEvent.VK_B:
                key3 = true;
                break;
            case KeyEvent.VK_ESCAPE:
                escape = true;
                break;

        }
    }
    public void keyReleased(KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.VK_P:
                key1 = false;
                break;
            case KeyEvent.VK_S:
                key2 = false;
                break;
            case KeyEvent.VK_B:
                key3 = false;
                break;
            case KeyEvent.VK_ESCAPE:
                escape = false;
                break;
        }
    }
}