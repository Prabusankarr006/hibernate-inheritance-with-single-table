package com.use;

import org.hibernate.*;
public class TPCExample 
{
	public static void main(String[]args)
	{
		Transaction tr=null;
		try (Session ses=HBUtil.getSessionFactory().openSession())
		{
			tr=ses.beginTransaction();
			Employee e1=new Employee("Navaneethan");
			RegEmployee e2=new RegEmployee("sales",5500,"Dhanush");
			Trainee e3=new Trainee("6 months",200,"Prabhu");
			
			ses.persist(e1); 
			ses.persist(e2); 
			ses.persist(e3);
			tr.commit();
			ses.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}