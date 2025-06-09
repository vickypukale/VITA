// Studing ArrayList and implemented it function's 
import java.util.ArrayList;
import java.util.Collections; // Collection is used for sorting other DS 

class S_Arraylist 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add function 
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(23);
        list.add(0);
        System.out.println(list);
        // get element 
        int element = list.get(1);
        System.out.println(element);
        // add element in between 
        list.add(1,1);
        System.out.println(list);
        // set element - we can replace any element with the help of index number 
        list.set(0,-1);
        System.out.println(list);
        // delete the element 
        list.remove(0);
        System.out.println(list);
        // Size of list 
        int size = list.size();
        System.out.println(size);
        // sort function 
        Collections.sort(list);
        System.out.println(list);
        // transverse 
        for(int i =0 ; i< list.size() ; i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
// done with ArrayList here thank you 