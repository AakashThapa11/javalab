package labprogram;

import java.util.Date;
import java.util.Stack;


public class Employee {
	public static void main(String[] args)
	{
		System.out.println("Enter Valid Employee ID : \n");
		int[] EmpId={11,100,92,1004}; //store employees id in an arraylist
		String[] EmpName={"Atc","arb","aadarsh","bajey"}; //tore employees name in an arraylist
		String[] JoinDate={"11/06/2011","23/11/2013","24/04/2008","15/01/2018"}; //store employees joining date in an arraylist
		char[] DesigCode={'e','c','k','r','m','e','c'};
		String[] Department={"ISE","CSE","ACCT","Engg"};
		double[] Basic={20000,30000,10000,12000};
		double[] HRA={8000,12000,8000,6000,};
		double[] IT={3000,9000,1000,2000,};
		char[] DesignationCode={'e','c','k','r','m'};
		String[] Designation={"Engineer","Consultant","Clerk","Receptionist","Manager"};
		double[] DA={20000,32000,12000,15000};
		int flag=0;
		int id=Integer.parseInt(args[0]);
		
		for(int i=0;i<EmpId.length;i++)
		{
			if(EmpId[i]==id)
			{
				flag=1;
				System.out.println("Emp Id.	 Emp Name	Department	Designation	   DA");
				System.out.print(EmpId[i]+" 	  "+EmpName[i]+" 		"+Department[i]);
				for(int j=0;j<DesignationCode.length;j++)
				{
					if(DesigCode[i]==DesignationCode[j])
					{	System.out.print(" 		"+Designation[j]+" 	");
						double sum=Basic[i]+HRA[i]+DA[j]-IT[i];//calculating sum
						System.out.print(sum);
					}
				}		
			}	
		}
		if(flag==0)
			System.out.println("There is no employee with EmpId : " +id);
	}


}
