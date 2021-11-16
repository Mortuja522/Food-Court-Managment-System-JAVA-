package  classes;
import interfaces.*;
import java.lang.*;

public class Restaurant implements FoodItemOperations
{
	private String name;
	private String rid;
	private FoodItem fooditems[] = new FoodItem[10];
	
	
	public void setName(String name){this.name = name;}
	public void setRid(String rid){this.rid = rid;}
	
	public String getName(){return name;}
	public String getRid(){return rid;}
	
	public void insertFoodItem(FoodItem f)
	{
		int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == null)
			{
				fooditems[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Fooditem Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	public void removeFoodItem(FoodItem f) 
	{
		int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == f)
			{
				fooditems[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Fooditem Removed");}
		else{System.out.println("Can Not Remove");}
	}
	public void showAllFoodItems()
	{
		for(FoodItem f : fooditems)
		{
			if(f != null)
			{
				f.showInfo();
			}
		}
	}
	public FoodItem getFoodItem(String fid)
	{
		FoodItem f = null;
		
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] != null)
			{
				if(fooditems[i].getFid() == fid) // dada valo achen...ji valo achi
				{
					f = fooditems[i];
					break;
				}
			}
		}
		if(f != null)
		{
			System.out.println("FoodItem Found");
		}
		else
		{
			System.out.println("FoodItem Not Found");
		}
		return f;
	}
}