/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author User
 */
public class recursion {
    public int getFac(int n){
    if(n==0){
    return 1;
    }
    return n*getFac(n-1);
    }
}
