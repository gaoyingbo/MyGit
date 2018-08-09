package top100questions;

/**
 * Created by gaoyingbo on 2018/8/9.
 */

import java.util.Scanner;
public class HammingPosition {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        HammingPosition solution = new HammingPosition();
        System.out.println("ss" + solution.solution(x,y));
    }

    public int solution(int x, int y){
        int result=0;

        int z = (x ^ y);
        //System.out.println(Integer.toBinaryString(z));
        String[] str = Integer.toBinaryString(z).split("");
        for (int i = 0; i < Integer.toBinaryString(z).length(); i++) {
            if(str[i].equals("1")){
                //System.out.println(str[i]);
                result ++;
            }
        }

        return result;
    }

}





