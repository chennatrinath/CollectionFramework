package epam.collections;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	CustomList<Integer> list = new CustomList<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.format("enter 1 to begin\nenter 0 to stop");
        int condition = sc.nextInt();
        System.out.format("Enter your choice\n1.To add Element\n2.To Remove element\n3.To print List Size\n4.To get element\n0.end");
         do{
        	 choice=sc.nextInt();
	        switch(choice) {
	        case 0:condition =0;
	        	System.out.println("process ended");
	        	break;
	        case 1:System.out.println("Enter number of elements to be insert ");
	        	int numberOfElement=sc.nextInt();
	        	System.out.println("Enter elements to insert ");
	        	for(int i=0;i<numberOfElement;i++) {
		        	int element=sc.nextInt();
		        	list.add(element);
	        	}
	        	System.out.println(list);
	        	break;
	        case 2:System.out.println("Enter index of element to remove ");
	        	int removeIndex=sc.nextInt();
	        	if(removeIndex>list.size()) {
		    		System.out.println("No element at index "+removeIndex);
		    	}
		    	else {
		    	list.remove(removeIndex);
		    	System.out.println(list);
		    	}
		    	break;
	        case 3: System.out.println(list.size());
	    		break;
	        case 4:System.out.println("Enter index to get element ");
		    	int getIndex=sc.nextInt();
		    	if(getIndex>list.size()) {
		    		System.out.println("No element at index "+getIndex);
		    	}
		    	else {
		    		System.out.println(list.get(getIndex));
		    	}
		    	break;
	    	default:System.out.println("invalid choice");
	        
	        }
        }while(condition!=0);
         sc.close();
    }
    
}
