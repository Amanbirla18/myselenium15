package test;

import java.util.ArrayList;
import java.util.List;

public class Occurenceofwords {
	public static void main(String[] args) {
		String str1 = "i am aman birla i aman ";
		
		String[] splitedarray =str1.split(" ");
		System.out.println(splitedarray.length);
		for(int i =0;i <splitedarray.length;i++){
			System.out.println(splitedarray[i]);
			
		}
		
		int count =0;
		for(int i =0;i <splitedarray.length;i++){
			for(int j =0;j <splitedarray.length;j++)
			{
				if(splitedarray[i].equals(splitedarray[j]))
				{
					count++;
				}
			}
			System.out.println("Count is :" + splitedarray[i] + " " +count);
			count=0;
		}
		
		String str = "I am a Boy I am a";
        String[] splitStr = str.split(" ");
        int count1 = 0;
        List<String> list = new ArrayList<>();
        for(String s:splitStr){
         //   if(!list.contains(s)){
                list.add(s);
          //  }
        }
        
        for(int i=0;i<list.size();i++){
            for(int j=0;j<splitStr.length;j++){
                if(list.get(i).equals(splitStr[j])){
                    count1++;
                }
            }
            System.out.println("Occurrence of " + list.get(i) + " is " + count1 + " times.");
            count1=0;
        }
	}

}
