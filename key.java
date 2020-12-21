import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class key extends main implements KeyListener { //Inherits the main class. Able to use methods.
    private KeyEvent keyPressed; 
public key(KeyEvent e){
    this.keyPressed = keyPressed;
}
    public void keyTyped(KeyEvent e){
        System.out.println("Key Typed: " + e.getKeyChar());

    }
    public void keyPressed(KeyEvent e){
        System.out.println("Key Pressed: " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e){
        System.out.println("Key Event: " + e.getKeyChar());
    }
}
