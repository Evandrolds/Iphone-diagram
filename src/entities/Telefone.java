
package entities;

/**
 *
 * @author Evandro
 */
public interface Telefone {
    boolean call(String number);
    boolean answer();
    boolean hangUp();
    void startVolceEmail();
    boolean playing();
    
}
