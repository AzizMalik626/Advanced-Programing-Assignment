/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_asst;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;
import java.util.*;
/**
 *
 * @author azizm
 */
public class AP_Asst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter \n1 for Array vs Vector.\n2 for Hash set vs Sorted set.");
        System.out.println("3 for Tree Set  vs Hash Set.\n4 for Array vs List.");
        System.out.println("5 for List vs Set.\n6 Navigable Set vs Navigable Map.");
        int x= in.nextInt();
        switch(x)
        {
            case(1):
                System.out.println("Array List declared: ");
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);arr.add(6);
                arr.add(7);arr.add(8);arr.add(9);arr.add(10);arr.add(11);arr.add(12);
                System.out.println("Array Data: ");
                for (int i = 0; i < arr.size() ; i++)
                    System.out.println(arr.get(i));
                
                System.out.println("\n\n\nVector declared: ");
                Vector<Integer> vArr = new Vector<Integer>();
                System.out.println("Vector Data: ");
                vArr.add(1);vArr.add(2);vArr.add(3);vArr.add(4);vArr.add(5);vArr.add(6);
                vArr.add(7);vArr.add(8);vArr.add(9);vArr.add(10);vArr.add(11);vArr.add(13);
                for (int i = 0; i < vArr.size() ; i++)
                    System.out.println(vArr.get(i));
                break;
            case(2):
                System.out.println("Hash set Example");
                Set<String> daysOfWeek = new HashSet<>();
                // Adding new elements to the HashSet
                daysOfWeek.add("Monday");
                daysOfWeek.add("Tuesday");
                daysOfWeek.add("Wednesday");
                daysOfWeek.add("Thursday");
                daysOfWeek.add("Friday");
                daysOfWeek.add("Saturday");
                daysOfWeek.add("Sunday");
                // Adding duplicate elements will be ignored
                daysOfWeek.add("Monday");
                System.out.println(daysOfWeek);
                
                System.out.println("\n\n\nSorted set Example");
                        SortedSet set = new TreeSet();
                
                        //add elements to the set
                set.add("apple");
                set.add("fox");
                set.add("goat");
                set.add("dog");
                set.add("elephant");
                set.add("ball");
                set.add("hat");
                set.add("cat");
                //iterate over the elements and print out the results
                Iterator iterator = set.iterator();
                while(iterator.hasNext())
                    System.out.print(iterator.next().toString()+" ");
                break;
            case(3):
                System.out.println("Hash set Example");
                Set<String> daysOfWeek1 = new HashSet<>();
                // Adding new elements to the HashSet
                daysOfWeek1.add("Monday");
                daysOfWeek1.add("Tuesday");
                daysOfWeek1.add("Wednesday");
                daysOfWeek1.add("Thursday");
                daysOfWeek1.add("Friday");
                daysOfWeek1.add("Saturday");
                daysOfWeek1.add("Sunday");
                // Adding duplicate elements will be ignored
                daysOfWeek1.add("Monday");
                System.out.println(daysOfWeek1);
                
                
                System.out.println("\n\n\nTree set Example");
                TreeSet<String> al=new TreeSet<String>();
                al.add("zeba");
                al.add("aziz");
                al.add("wajeeh");
                al.add("imaz");

                Iterator<String> itr=al.iterator();
                while(itr.hasNext())
                    System.out.println(itr.next());
                break;
            case(4):
                System.out.println("Array declared and it is of fix size");
                int[] arrr = new int[10];
                for (int i = 0; i < 10; i++) {
                    arrr[i]=i;
                    System.out.println("Array index " + i+1 +": " + arrr[i]);
                }
                
                System.out.println("List declared and it is of variable size");
                List<Integer> lArr = new ArrayList<Integer>();
                for (int i = 0; i < 10; i++){
                    lArr.add(i);
                    System.out.println("List element "+ i+1 +": "+lArr.get(i));
                }
                break;
            case(5):
                System.out.println("List declared and it can have dupliactes");
                List<Integer> lArr1 = new ArrayList<Integer>();
                for (int i = 0; i < 10; i++){
                    lArr1.add(0);
                    System.out.println("List element "+ i+1 +": "+lArr1.get(i));
                }
                System.out.println("\n\n\nSet cannot have duplicates");
                TreeSet<String> al1 =new TreeSet<String>();
                al1.add("zeba");
                al1.add("aziz");
                
                al1.add("wajeeh");
                al1.add("wajeeh");//trying to add duplicate
                
                
                al1.add("imaz");

                Iterator<String> itr1 = al1.iterator();
                while(itr1.hasNext())
                    System.out.println(itr1.next());
                break;
            case(6):
                NavigableSet<Integer> ns = new TreeSet<>(); 
                ns.add(2); 
                ns.add(3); 
                ns.add(4); 
                ns.add(7); 
                ns.add(1); 
                ns.add(5); 
                ns.add(6);
                ns.add(6);
                System.out.println("Normal order: " + ns);
                
                NavigableMap<String, Integer> nm = 
                          new TreeMap<String, Integer>(); 
                nm.put("C", 888); 
                nm.put("Y", 999); 
                nm.put("A", 444); 
                nm.put("T", 555); 
                nm.put("B", 666); 
                nm.put("A", 555); 
                System.out.printf("Original Map : %s%n", nm);

                break;
                
        }
        
        
    }
    
}
