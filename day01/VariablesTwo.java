package day;

public class VariablesTwo {
	public static void main(String[] args) {
		
		
	//Task -4
	//Assign the value "IN 1491 COLUMBUS SAILED THE OCEANBLUE" to an appropriate variable, 
	//write a program in Java to change the year in the statement above from 1491 to 1492.
		
	String str = "IN 1491 COLUMBUS SAILED THE OCEANBLUE";
	str = "IN 1492 COLUMBUS SAILED THE OCEANBLUE";
	System.out.println(str);
	System.out.println("---");
	
	//Task -5
	/*
	 * Store the following into variables: number of children, partner's name, geographic location, job title.
     * Output your fortune to the screen like so: "You will be a X in Y, and married to Z with N kids. "
     *  X – Job title
     *  Y – Location
     *  Z – Partner’s name 
     *  N - # of kids
	 */
	
	String x = "teacher";
	String y = "new yark city";
	String z = "Nancy";
	int n = 3; 
	System.out.println("You will be a "+x+" in "+y+", and married to "+z+" with "+n+" kids.");
	System.out.println("---");
	
	
	//Task -6
	//Create three int variables: month, day, year
	//Takes those values and put them into a string in this format: “M/D/Y”
	
	int month = 01;
	int day = 16;
	int year = 2023;
	
	System.out.println(month+"/"+day+"/"+year);
	System.out.println("---");
	
	//Task -7
	int i = 100;
	i = 10;
	System.out.println(i);
	System.out.println("---");
	
	//Task -8
	int a;
	int b;
	b=100;
	a=b;
	System.out.println(a);
	System.out.println("---");
	
	//Task -9
	int k, l, m;
	k=10;
	l=20;
	m=k;
	k=l;
	System.out.println(k);
	System.out.println(l);
	System.out.println(m);
	
	
	
	
	}

}
