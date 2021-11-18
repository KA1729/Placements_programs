import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class test2 {
    static int operation(int v1,int v2,char c1){
        if(c1=='+'){
            return v1+v2;
        }else{
            return v2-v1;
        }
    }
    public static void main(String[] args) {
        String str="onetwoplusthreefourplusfiveseven";
    Map<String,Integer> mp=new HashMap<>();
    mp.put("one",1);
    mp.put("two",2);
    mp.put("three",3);
    mp.put("four",4);
    mp.put("five",5);
    mp.put("six",6);
    mp.put("seven",7);
    mp.put("eight",8);
    mp.put("nine",9);

    Map<String,Character> mp2=new HashMap<>();
    mp2.put("plus",'+');
    mp2.put("minus",'-');

    Stack<Integer>st=new Stack<>();
    Stack<Character>st1=new Stack<>();

    int i=0;
    String str3="";
    String str4="";
    int n=0;
    int l=str.length();
    for(int j=1;j<=str.length();j++){
        String str1=str.substring(i,j);
        if(mp.containsKey(str1)){
            str3+=mp.get(str1);
            if(j==l){
                n=Integer.parseInt(str3);
                st.push(n);
            }else{
                i=j;
                j=j+1;
            }

        }

       if(mp2.containsKey(str1)){
           st1.push(mp2.get(str1));
           str4=str3;
           str3="";
            n=Integer.parseInt(str4);
           st.push(n);
           str4="";
            i=j;
            j=j+1;
        }
    }
// System.out.println(st.size()); //operand size
// System.out.println(st1.size()); //operator size

        while(st1.size()!=0){
            int v1=st.pop();
            int v2=st.pop();
            char opr=st1.pop();
            int result=operation(v2,v1,opr);
            st.push(result);
        }
      int finalresult=st.pop();
        String finalstring=Integer.toString(finalresult);


        Map<Character,String> mp3=new HashMap<>();
        mp3.put('1',"one");
        mp3.put('2',"two");
        mp3.put('3',"three");
        mp3.put('4',"four");
        mp3.put('5',"five");
        mp3.put('6',"six");
        mp3.put('7',"seven");
        mp3.put('8',"eight");
        mp3.put('9',"nine");
        mp3.put('0',"zero");

        String output="";
        for(int t=0;t<finalstring.length();t++){
            output=output+mp3.get(finalstring.charAt(t));
        }
        System.out.println(output);





  }

  }
