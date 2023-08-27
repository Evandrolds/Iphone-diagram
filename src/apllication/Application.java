
package apllication;

import entities.Browser;
import entities.Iphone;

/**
 *
 * @author Evandro
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iphone phone = new Iphone();
        
        // browsing the internet
        System.out.println(" Browsing the internet");
        phone.showPage();
        phone.addNewPage("Page");
        phone.addNewTab("Tap");
        phone.updatePage("page updated");
        
        // Making a call
        System.out.println("Making a call....");
        phone.call("11979545512");
        phone.answer();
        
        // Listening to favorite miusic
        System.out.println("Selecting your favorite music");
        phone.playeingMusic();
        phone.start();
        phone.selecMusic();
    }
    
}
