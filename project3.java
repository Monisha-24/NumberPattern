/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1;

import java.util.Scanner;
/**
 *
 * @author welcome
 */
public class project3 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        
    System.out.println("Number of rows you want in this pattern?");         
        int n= sc.nextInt();         
        System.out.println("----Pattern is----");         
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
 
            System.out.println();
    }
    }}
