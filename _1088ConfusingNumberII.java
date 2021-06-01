package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1088ConfusingNumberII {

    int numConfusing = 0;
    int n;
    int arr[] = {0,1,6,8,9};

    public boolean isConfusing(String number){
        StringBuilder sb = new StringBuilder();
        for(int i=number.length()-1;i>=0;i--){
            char ch = number.charAt(i);
            if(ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='7')return false;
            if(ch=='0')sb.append('0');
            if(ch=='1')sb.append('1');
            if(ch=='6')sb.append('9');
            if(ch=='8')sb.append('8');
            if(ch=='9')sb.append('6');
        }
        return !sb.toString().equals(number);
    }

    public void addConfusingNumbers(String number){

        for(int i=0;i<arr.length;i++){
            String val = number+arr[i];
            long intval = Long.valueOf(val);
            if(intval>n)continue;
            boolean ret = isConfusing(val);
            if(ret){
                ++numConfusing;
            }
            addConfusingNumbers(val);
        }
    }

    public int confusingNumberII(int n) {
        if(n<5)return 0;
        if(n==6)return 1;
        if(n<=10)return 2;
        this.n = n;
        this.numConfusing=2;
        for(int i=1;i<arr.length;i++){
            addConfusingNumbers(String.valueOf(arr[i]));
        }
        return numConfusing;
    }

    public int test(){
        try{
            throw new Exception("");
        }catch (Exception e){
            System.out.println("Catch block");
        }finally {
            System.out.println("in finally");
        }

        System.out.println("");
        return 10;
    }

    public static void main(String[] args) {
        //System.out.println(new _1088ConfusingNumberII().confusingNumberII(1000000000));
        //System.out.println(new _1088ConfusingNumberII().test());
        Map<Integer,String>map = Map.of(1,"One",2,"Two",3,"Three");
        map.forEach((k,v)-> System.out.println(k));
    }
}
