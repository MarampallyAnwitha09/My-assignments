mport java.util.*;
public class Collections {
public static void main(String[] args) {
List<Integer> list = new ArrayList<Integer>(5);
        list.add(10);
        list.add(7);
        list.add(250);
        list.add(47);
        list.add(24);
        list.add(199);
        list.add(7000);
        list.add(3);
        list.add(247);
        list.add(10);
        System.out.println(list);//displaying the list
        for(int i=0;i<list.size();i++)
        {
        if(list.get(i)==7000)
        System.out.println(i);//Searching for an element
        }
        list.set(9,400);
        list.remove(5);//removing an elements
        Iterator<Integer> i=list.iterator();
        while(i.hasNext())
        {
        System.out.println(i.next()+" ");//displaying the list
        }  
}
}

