package com.maveneg.myMaven;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bean.Assetmgnt;
import com.bean.Employees;
import com.bean.Product;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfiguration ac=new AnnotationConfiguration();
    	ac.configure("./Resources/hibernate.cfg.xml");
    	SessionFactory sf=ac.buildSessionFactory();
    	Session sess=sf.openSession();
    	Transaction trs=sess.beginTransaction();
    	
    	/*Product pd=new Product();
    	pd.setP_id(5);
    	pd.setP_name("tab");
    	pd.setPrice(12000);*/
    	
    	//sess.save(pd);
    	
     	//Query qy=sess.createQuery("from Product p");
    	//Query qy=sess.createQuery("from Employees emp");
    	
    	//List li=qy.list();
    	//li.stream().forEach(i -> System.out.println(i));
    	
    	              //*****delete
    	//Query qy1=sess.createQuery("delete from Product p where p.p_name=:ref");
    	//qy1.setParameter("ref", "tab");
    	//int i=qy1.executeUpdate();
    	
    	
    	              //***update
    	/*Query qu=sess.createQuery("update Product p set p.p_name=:re where p.p_id=:r");
    	qu.setParameter("re", "lap");
    	qu.setParameter("re", "lap");
    	qu.setParameter("r", 1);
    	int c=qu.executeUpdate();
    	System.out.println(c+" updated"); */
    	
    	
    					//*******one to many**********//
    	
    	Query qe=sess.createQuery("select emp from Employees emp");
    	List<Employees> l1=qe.list();
   
    	               //********get all element
    	/*l1.stream().forEach(e ->{ 
    	System.out.println(e.getName()+" ,"+e.getDepartment()+" ,"+e.getSalary());
    	
    	e.getAssest().stream().forEach(i-> 
    	System.out.println(i.getAm_id()+" ,"+i.getAsset_name()+" ,"+i.getVendor()));
    	});*/
    	
    	
    	                  //******get name only
    	l1.stream().forEach(e->{
    		System.out.println(e.getName()+":");
    	e.getAssest().stream().forEach(e1->System.out.print(e1.getAsset_name()+" "));
    	System.out.println();
    	System.out.println("................");

    	});
    	
    	            //**********one to one*******//
    	Query q=sess.createQuery("select emp from Employees emp");
    	System.out.println("  -------------------------------------");
    	System.out.println("  ->>>>>>>>>Employees Details<<<<<<<<<-");
    	System.out.println("  -------------------------------------");
    	List<Employees> l=qe.list();
    	l1.stream().forEach(e->{
    		
    		System.out.println(e.getName()+":- "+e.getEmp_Details().getAddress()+", "+e.getEmp_Details().getGender()+", "+e.getEmp_Details().getBank_account()+", "+e.getEmp_Details().getYears_of_service());
    	});
    	
    	
    	System.out.println("*****************************************");
    	Query query=sess.createQuery("select e from Employees e");
    	List<Employees> emplist=query.list();
    	emplist.stream().forEach(temp->{
    		temp.getEmpAssignmentList().stream().forEach(tep->
    		System.out.println("Project-->"+temp.getName()+": "+tep.getName()+", "+tep.getOwner()));
    	});
    	
        
    	//Assetmgnt ass=new Assetmgnt();
    	
    	//System.out.println(l1);
    	
    	//trs.commit();
    	//System.out.println("Done");
    }
}
