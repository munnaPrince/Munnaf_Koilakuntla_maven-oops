package com.task;


class MavenTask21 implements Comparable{
	int weight=1;
	String name="";
	String color="yellow";
	float calories=0;
	public int compareTo(Object o) {
	return 0;
	}
	}
	class Chocolate extends MavenTask21{}
	class FiveStar extends Chocolate
	{
	FiveStar ()
	{
	this.name="FiveStar chocolate";
	this.calories=50;
	}
	}
	class KitKat extends Chocolate{
	KitKat()
	{
	this.name="KitKat chocolate";
	this.calories=150;
	}
	}
	class Cadbury extends Chocolate{
		Cadbury()
		{
			this.name="Cadbury Chocolate";
			this.calories=20;
					
		}
	}
	class Snickers extends Chocolate{
		Snickers()
		{
			this.name="Snickers Chocolate";
			this.calories=120;
					
		}
	}
public  class MavenTask2 {
	public static void main(String[] args) {
	MavenTask21[]  allsweets = new MavenTask21[5];
	allsweets [0]= new FiveStar();
	allsweets [1]= new FiveStar();
	allsweets [2]= new KitKat();
	allsweets [3]=new Cadbury();
	allsweets [4]=new Snickers();
	float total_Calories =0;
	int wei=0;
	for (int i = 0; i < allsweets.length; i++) {
	MavenTask21 s = allsweets[i];
	total_Calories += s.calories;
	wei+=s.weight;
	}
	System.out.println(" the total calories in the chocolate are  = "+total_Calories);
	System.out.println(" Printing the chocolates in the New Year's Gift");
	for (int i = 0; i < allsweets.length; i++) {
	MavenTask21 obj = allsweets[i];
	System.out.println(obj.name);
	
	}
	System.out.println("the total number of chocolates for the new Year Gift is "+wei);
	
}
	}
