/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M8 {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("names.txt");
        Scanner sc1=new Scanner(f1);
        String name="";
        Tools t1=new Tools();
        name=sc1.nextLine();
        System.out.println(t1.reverse(name));
         name=sc1.nextLine();
        System.out.println(t1.reverse(name));
      name=sc1.nextLine();
        System.out.println(t1.reverse(name));
     
     
}
        
    }
        
    

