
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.lang.Object;

class SiteStats {
    private String url;
    private int numVisits;

    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

   
    
    
    @Override
    public String toString() {
        return  (url +"  | "+"[ "+numVisits+" ]") ;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

   
    public int getNumVisits() {
        return numVisits;
    }

    public void setNumVisits(int numVisits) {
        this.numVisits = numVisits+1;
    }

    void setNumVisit(int z) {
        this.numVisits = numVisits;
    }

    

   

    
    
}
public class partB {
     private static  Queue<SiteStats> sites = new LinkedList<SiteStats>();
    
     // Method to find the website in the queue and increment the visited count by 1, adding new node in case website is not found
    public static int updateCount(String url) {
       
      
       String s=url;
        
         for(Object obj : sites) 
         {
                  SiteStats e = (SiteStats) obj;
        
      
       
                     if(e.getUrl().equals(s))
                        {
                            System.out.println(" already ");
                             e.setNumVisits(e.getNumVisits());
                             return(0);
                        }
        
        
           }//for
        return(1);
    }
        
        
    public static void main(String[] args) {
        
        
       
       
  while(true)
  {
    System.out.println("    Enter Choice , 1:add,2: mostVisitedSite,0: To Stop ");
    
    Scanner s1=new Scanner(System.in);
              
     int ch = s1.nextInt();
    switch(ch)
      {
        case 1:
            
           System.out.println(" enter site u r visiting : ");
            Scanner s2=new Scanner(System.in);
            String website=s2.nextLine();
            int j=updateCount(website);
            if(j==1)
          {
              System.out.println(" Entered");
              SiteStats m=new SiteStats(website,1);
              sites.add(m);
              //System.out.println(sites);
          }
             Iterator<SiteStats> itr = sites.iterator(); 

               while(itr.hasNext())
                   {
                     System.out.print(" -> "+itr.next());
                   }

          break;
        case 2:
            System.out.println("    Enter how many top sites to display :  ");
            Scanner s3=new Scanner(System.in);
              
             int n = s3.nextInt();
             int g= sites.size();
             sortQueue(sites); 
             //sorting(sites,g);
             listTopVisitedSites(sites,n);
             break;
       case 0:
            return;
        default:
           System.out.println("Wrong choice : ");
       }
    
   

        
              
            //System.out.print(itr.next()); 
      
       // sites.forEach((n) -> System.out.println("yes : "+n)); 
  }//while
    
    }
    private static void listTopVisitedSites(Queue<SiteStats> sites, int i)
      {
          
         
          Iterator<SiteStats> itr = sites.iterator(); 
          int k=0;
          while(itr.hasNext())
           {
               if(k==i)
                {
                  break;
                }
               System.out.print(" -> "+itr.next());
                k++;
           }

        }

    private static void sorting(Queue<SiteStats> sites, int g) 
    {
        System.out.println("  Length : "+g);
        int h=g;
        int v=0;
        int j=0;
        SiteStats r1,r2,r3;
        
        for(Object ob1:sites)
        {
            r1=(SiteStats) ob1;
            
             //Object e1 = (SiteStats) sites;
          for(Object ob2:sites)  
          {
              
              r2=(SiteStats) ob2;
              System.out.print(r1.getNumVisits());
              System.out.print(r2.getNumVisits());
              System.out.println(sites);
             //Object e2 = (SiteStats) sites;
             if(r1.getNumVisits()>r2.getNumVisits())
             {
                //Object e3=(SiteStats)sites;
                  //SiteStats e3 = (SiteStats) ob1;
                       int y=r1.getNumVisits();
                       int z=r2.getNumVisits();
                       String s1=r1.getUrl();                     
                       String s2=r2.getUrl();
                         r1.setNumVisit(z);
                         r1.setUrl(s2);
                         r2.setNumVisit(z);
                         r2.setUrl(s1);
                          
             }
          }
        }
        System.out.println(sites);
     /*  Iterator<SiteStats> itr1=sites.iterator(); 
      
    Iterator<SiteStats> itr2=sites.iterator(); 
     
       
               while(v<g-1)
                   {
                       System.out.println(" Outer ");
                                        
                      r1=itr1.next();
                      System.out.println("val :"+r1.getUrl());
                      r2=itr2.next();
                      System.out.println(" no ");
                        
                     while(j<g-v-1)
                     {
                         r2=itr2.next();
                         
                        System.out.println(" val1 :"+r1.getUrl()+": "+r1.getNumVisits());
                         System.out.println(" val2 : "+r2.getUrl()+" : "+r2.getNumVisits());
                         if(r1.getNumVisits()<r2.getNumVisits())
                         {
                             r3=r1;
                             r1=r2;
                             r2=r3;
                             
                         }
                         System.out.println(sites);
                         System.out.println("next val1 :"+r1.getUrl()+": "+r1.getNumVisits());
                         System.out.println(" next val2 : "+r2.getUrl()+" : "+r2.getNumVisits());
                         
                         j++;
                         
                        
                     }
                  v++;
                   
                   }
        }*/
   
 
    }
    

//  push element to last by 
// popping from front until size becomes 0 
static void FrontToLast(Queue<SiteStats> q, int qsize) 
						
{ 
	// Base condition 
	if (qsize <= 0) 
		return; 

	// pop front element and push 
	// this last in a queue 
	q.add(q.peek()); 
	q.remove(); 

	// Recursive call for pushing element 
	FrontToLast(q, qsize - 1); 
} 

// Function to push an element in the queue 
// while maintaining the sorted order 
static void pushInQueue(Queue<SiteStats> q,SiteStats temp, int qsize)  
						
{ 
    SiteStats s5=q.peek();
	// Base condition 
	if (q.isEmpty() || qsize == 0) 
	{ 
		q.add(temp); 
		return; 
	} 

	// If current element is less than 
	// the element at the front 
	else if (temp.getNumVisits() > s5.getNumVisits()) 
	{ 

		// Call stack with front of queue 
		q.add(temp); 

		// Recursive call for inserting a front 
		// element of the queue to the last 
		FrontToLast(q, qsize); 
	} 
	else
	{ 

		// Push front element into 
		// last in a queue 
		q.add(q.peek()); 
		q.remove(); 

		// Recursive call for pushing 
		// element in a queue 
		pushInQueue(q, temp, qsize - 1); 
	} 
} 

//sort the given 
// queue using recursion 
static void sortQueue(Queue<SiteStats> q) 
{ 

	// Return if queue is empty 
	if (q.isEmpty()) 
		return; 

	// Get the front element which will 
	// be stored in this variable 
	// throughout the recursion stack 
	SiteStats temp = q.peek(); 

	// Remove the front element 
	q.remove(); 

	// Recursive call 
	sortQueue(q); 

	// Push the current element into the queue 
	// according to the sorting order 
	pushInQueue(q, temp, q.size()); 
} 
}