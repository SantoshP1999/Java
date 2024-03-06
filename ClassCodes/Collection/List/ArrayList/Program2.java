
// ..........ArrayList.............

import java.util.*;
class ArrayListDemo2 extends ArrayList{
    public static void main(String[]args){
 
        ArrayListDemo2 al=new ArrayListDemo2();

        //Adding Elements into ArrayList 
        //add(Element)
        al.add(10);
        al.add(20.5f);
        al.add("Santosh");
        al.add(20.5f);
        System.out.println("Elements:"+al);     //Elements:[10, 20.5, Santosh, 20.5]

        // int size()
        System.out.println(al.size());      //4
        
        // boolean contains(Object)
        System.out.println(al.contains("Santosh"));     //true


        // int indexOf(object)
        System.out.println(al.indexOf("Santosh"));      //2
        
        // int lastIndexOf(object)
        System.out.println(al.lastIndexOf(20.5f));      //3
        
        // E get(int)
        System.out.println(al.get(3));                  //20.5

        // E set(index,Element)
        al.set(3,"Shivam");

        //System.out.println(al.set(3,"Shivam"));
        System.out.println(al);                         //[10, 20.5, Santosh, Shivam]

        //void add(int Element)
        al.add(3,"Sai");
        System.out.println(al);                     //[10, 20.5, Santosh, Sai, Shivam]
        
        // E remove(int)
        System.out.println(al.remove(4));   //Shivam
        System.out.println(al);             //[10, 20.5, Santosh, Sai]


        // boolean addAll(collection)

        ArrayList al2=new ArrayList();
        al.add("Suraj");
        al.add("Shiva");
        al.add("Shital");

        al.addAll(al2);
        System.out.println(al);                 //[10, 20.5, Santosh, Sai, Suraj, Shiva, Shital]

        // boolean addAll(int collection)

        al.addAll(3,al2);
        System.out.println(al);                 //[10, 20.5, Santosh, Sai, Suraj, Shiva, Shital]


        // // protected  void removeRange(int int)
        al.removeRange(3,5);
        System.out.println(al);                     //[10, 20.5, Santosh, Shiva, Shital]

        // Object[]toArray()
        Object arr[]=al.toArray();
        System.out.println(arr);                    //[Ljava.lang.Object;@251a69d7

        for(Object data:arr){
            System.out.print(data+" ");             //10 20.5 Santosh Sai Suraj Shiva Shital 
        }
        System.out.println();
        
        // clear()
        al.clear();
        System.out.println(al);                     //[]

    }
}