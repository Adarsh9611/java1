/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
interface Resizeable{
    void resizeWidth(int width);
     void resizeHeight(int height); 
}
class Rectangle implements Resizeable{
    private int width;
    private int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
 public void resizeWidth(int width){
     this.width=width;
 }
 public void resizeHeight(int height){
          this.height=height;}
 public void display(){
     System.out.println("Recatngle width:"+width);
     System.out.println("Recatngle height:"+height);
 }}
public class k116 {
    public static void main(String[] args){
        String title0="lab 7 program-resizeable interface";
        String title1="develop a java program to create an interface resizeable with methods resizewidth(int width and resizeheoight(int height) that allow an object to be resizesd";
        String title2="create a calss rectangle that implements the resizeable interface that bimplements the nresize methods";
        System.out.println(title0+"\n"+title1+"\n"+title2);
        Rectangle r1=new Rectangle(5,10);
        System.out.println("\n original rectangle:");
        r1.display();
        r1.resizeWidth(8);
        r1.resizeHeight(12);
        System.out.println("\n resized rectangle:");
        r1.display();
    }
}
