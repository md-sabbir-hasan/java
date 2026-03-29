
package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
//        try {
//            int result= 10/0;
//        } catch (Exception e) {
//            System.out.println(e);
//        }


//Runnable runA = new Multithread('A', 10);
//Runnable runB = new Multithread('B', 10);
//Thread t1 = new Thread(runA);
//Thread t2 = new Thread(runB);
//t1.start();
//t2.start();



//        File file= new File("java.dat");
//        try {
//            FileOutputStream fos= new FileOutputStream(file);
//            for(int i=0;i<=20;i++){
//            fos.write(i);
//            }
//        } catch (FileNotFoundException ex) {
//            System.getLogger(Practice.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
//        } catch (IOException ex) {
//            System.getLogger(Practice.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
//        }
//        
//        
//        try {
//            FileInputStream fis= new FileInputStream(file);
//            int value;
//            while((value=fis.read())!=-1){
//                System.out.println(value+ " ");
//            }
//        } catch (FileNotFoundException ex) {
//            System.getLogger(Practice.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
//        } catch (IOException ex) {
//            System.getLogger(Practice.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
//        }

//int[][] array = {{1, 99, 91, 11, 44}, {0, 10, 9, 9, 11}, {3, 23, 21, 5, 20}, {13, 4, 45, 66, 33}, {11, 0, 1, 20, 56}};
//      System.out.println(Arrays.deepToString(array));
//      
//      for(int[]item : array){
//      for(int i=0; i<item.length-1;i++){
//      for(int j=0; j<item.length-1-i;j++){
//      if(item[j]>item[j+1]){
//      int temp= item[j];
//      item[j]=item[j+1];
//      item[j+1]=temp;
//      }
//      }
//      }
//      }
//      System.out.println(Arrays.deepToString(array));

//recursion rec = new recursion();
//int res= rec.getFac(5);
//        System.out.println(res);

circle c= new circle();
double res= c.getArea(5.00);
        System.out.println(res);
    }
    
}
