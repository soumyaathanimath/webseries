/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package webseries;

import java.util.Scanner;

/**
 *
 * @author dell1
 */
public class Webseries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a URL");
        String url=scan.nextLine();
     
        String protocol=url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        
        
        String ext=url.substring(url.lastIndexOf(".")+1);
        
        if(ext.equals("com"))
            System.out.println("Commercial");
        else if(ext.equals("org"))
            System.out.println("Organisation");
        else if(ext.equals("net"))
            System.out.println("Network");
        
    }
    
}
