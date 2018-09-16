package clases;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class TextoFormateado extends JTextField {
    
    private int[] keyCodeArray ={KeyEvent.VK_RIGHT,KeyEvent.VK_LEFT,KeyEvent.VK_BACK_SPACE};
    //private char [] charArray = {'#','&','%',' '};

    public TextoFormateado() {
    }

    public void processKeyEvent(KeyEvent e) {
        int keyCode = e.getKeyCode();
        char character=e.getKeyChar();
        if (containsInteger(keyCode)||Character.isDigit(e.getKeyChar())/*||containsCharacter(character)*/) {
            super.processKeyEvent(e);                        
        } else {
            e.consume();
        }
    }
    
    private boolean containsInteger(int keyCode){
        for (int i = 0; i < keyCodeArray.length; i++) {
            int code = keyCodeArray[i];
            if (keyCode==code) {
                return true;
            }
        }
        return false;
    }
    
  /*  private boolean containsCharacter(char character){
        for (int i = 0; i < charArray.length; i++) {
            Character c = charArray[i];
            if (c.equals(character)) {
                return true;
            }
        }
        return false;
    }*/
}