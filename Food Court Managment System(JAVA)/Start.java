import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt b = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-----Welcome to our Food Court Management Application-----");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Restaurant Management");
			System.out.println("	3. Restaurant FoodItem Management");
			System.out.println("	4. FoodItem Quantity Add-Sell");
			System.out.println("	5. Exit\n");

			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Employee Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Insert New Employee");
					System.out.println("	2. Search an Employee");
					System.out.println("	3. Remove Existing Employee");
					System.out.println("	4. Show All Employees");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							b.insertEmployee(e1);
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Get An Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = b.getEmployee(empId2);
							
							if(e2 !=null)
							{
								System.out.println();
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Remove an Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = b.getEmployee(empId3);
							
							if(e3 != null)
							{
								b.removeEmployee(e3);
							}
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Show All Employees");
							b.showAllEmployees();
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("--------------------------------");
					break;
					
				case 2:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Restaurant Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Restaurant");
					System.out.println("	2. Search a Restaurant");
					System.out.println("	3. Remove Existing Restaurant");
					System.out.println("	4. Show All Restaurants");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
						
							b.insertRestaurant(r1);
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Search a Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							
							Restaurant r2 = b.getRestaurant(rid2);
							
							if(r2 !=null)
							{
								System.out.println();
								System.out.println("Restaurant ID: "+r2.getRid());
								System.out.println("Restaurant Name: "+r2.getName());
								r2.showAllFoodItems();
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Remove an Existing Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							
							Restaurant r3 = b.getRestaurant(rid3);
							
							if(r3 != null)
							{
								b.removeRestaurant(r3);
							}
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Show All Restaurant");
							b.showAllRestaurants();
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("--------------------------------");
					break;
					
				case 3:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Restaurant FoodItem Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New FoodItem for a Restaurant");
					System.out.println("	2. Get an FoodItem of a Restaurant");
					System.out.println("	3. Removing an Existing FoodItem of a Restaurant");
					System.out.println("	4. Show All FoodItems of all Restaurants");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New FoodItem for a Restaurant\n");
							
							FoodItem f = null;
							
							System.out.println("Which type of FoodItem do you want to Create?\n");
							System.out.println("	1. MainDish");
							System.out.println("	2. Appitizers");
							System.out.println("	3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								MainDish m = new MainDish();
								
								System.out.print("Enter FoodItem ID:");
								String fd1 = sc.next();
                                System.out.print("Enter FoodItem Name: ");
                                String fn1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter FoodItem Price: ");
								double fp1 = sc.nextDouble();
								System.out.print("Enter Categoty: ");
								String c1 = sc.next();
								
								m.setFid(fd1);
								m.setName(fn1);
								m.setAvailableQuantity(aq1);
								m.setPrice(fp1);
								m.setCategory(c1);
								
								f = m;
								
							}
							else if(type == 2)
							{
								Appitizers a = new Appitizers();
								
								System.out.print("Enter FoodItem ID:");
								String fd1 = sc.next();
                                System.out.print("Enter FoodItem Name: ");
                                String fn1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter FoodItem Price: ");
								double fp1 = sc.nextDouble();
								System.out.print("Enter Size: ");
								String s1 = sc.next();
								
								a.setFid(fd1);
								a.setName(fn1);
								a.setAvailableQuantity(aq1);
								a.setPrice(fp1);
								a.setSize(s1);
								
								f = a; 
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(f!= null)
							{
								System.out.print("Enter Restaurant ID: ");
								String rid1 = sc.next();
								b.getRestaurant(rid1).insertFoodItem(f);
							}
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Get a FoodItem of a Restaurant\n");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							System.out.print("Enter FoodItem ID: ");
							String fd2 = sc.next();
							
							FoodItem f2 = b.getRestaurant(rid2).getFoodItem(fd2);
							
							if(f2 != null)
							{
								f2.showInfo();
							}
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Remove an FoodItem of a Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							System.out.print("Enter FoodItem ID: ");
							String f3 = sc.next();
							
							b.getRestaurant(rid3).removeFoodItem(b.getRestaurant(rid3).getFoodItem(f3));
							
							/*
							Restaurant c3 = b.getRestaurant(nid3);
							if(c3 ! = null)
							{
								FoodItem a3 = c3.getFoodItem(an3);
								
								if(a3 ! = null)
								{
									c3.removeFoodItem(a3);
								}
							}
							else
							{
								System.out.println("Invalid Input");
							}
							*/
							System.out.println("########################");
							break;
						
						case 4: 
						
							System.out.println("########################");
							System.out.println("Show All FoodItems of a Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid4 = sc.next();
							
							b.getRestaurant(rid4).showAllFoodItems();
							
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back..");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					
				case 4:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen FoodItem Quantity Add-Sell");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Add FoodItem");
					System.out.println("	2. Sell FoodItem");
					System.out.println("	3. Show Add Sell History");
					System.out.println("	4. Go Back\n");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
							System.out.println("#########################");
							System.out.println("Add FoodItem");
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							System.out.print("Enter FoodItem ID: ");
							String fd1 = sc.next();
							System.out.print("Enter Quantity to Add: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								b.getRestaurant(rid1).getFoodItem(fd1).addQuantity(amount1);
								frwd.writeInFile(amount1+" has been Added in FoodItem ID "+ fd1);
								//frwd.writeInFile("Deposit: $"+amount1+" in "+an1);
							}
							System.out.println("#########################");
							break;
							
						case 2:
						
							System.out.println("#########################");
							System.out.println("Sell FoodItem");
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							System.out.print("Enter FoodItem ID: ");
							String fd2 = sc.next();
							System.out.print("Enter Quantity to Sell: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2<=b.getRestaurant(rid2).getFoodItem(fd2).getAvailableQuantity())
							{
								b.getRestaurant(rid2).getFoodItem(fd2).sellQuantity(amount2);
								frwd.writeInFile(amount2+" has been Sold out from FoodItem ID "+ fd2);
							}
							System.out.println("#########################");
							break;
						
						case 3:
						
							System.out.println("#########################");
							System.out.println("Show Transaction History\n");
							frwd.readFromFile();
							System.out.println("\n#########################");
							break;
							
						case 4:
						
							System.out.println("#########################");
							System.out.println("Going Back");
							System.out.println("#########################");
							break;
							
						default:
						
							System.out.println("#########################");
							System.out.println("Invalid Option");
							System.out.println("#########################");
							break;
						
					}
					
					System.out.println("--------------------------------");
					break;
					
				case 5:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen to Exit");
					repeat = false;
					System.out.println("--------------------------------");
					break;
					
				default:
				
					System.out.println("--------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("--------------------------------");
					break;
			}
			
			
		}
		
		
	}
}
