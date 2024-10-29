/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class Outer{
    void dispaly(){
        System.out.println("outer class dispaly method");
    }
   class Inner{
      void display(){
          System.out.println("inner class dispaly method");
      }
   }
}
public class k117 {
     public static void main(String[] args){
         String title0="lab 8 program-nestred class";
         String title1="develop a java program to create an outer class with a function dispaly";
         String title2="create another class inside the outer class named inner with a function called display";
         String title3="call the two functions in the main class";
         System.out.println(title0+"\n"+title1+"\n"+title2+"\n"+title3+"\n");
         Outer o1=new Outer();
         o1.dispaly();
         Outer.Inner i1=o1.new Inner();
         i1.display();
     }
    
}
