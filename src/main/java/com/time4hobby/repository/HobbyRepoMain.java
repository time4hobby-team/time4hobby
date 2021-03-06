/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.time4hobby.model.Hobby;
import com.time4hobby.util.HibernateUtil;

/**
 *
 * @author spalakod
 */
public class HobbyRepoMain {

	public static void main(String[] args) {
//   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        HobbyDAOImpl hobbyDAOImpl =
//                (HobbyDAOImpl) context.getBean("hobbyDAOImpl");
//
//      //  System.out.println("------Records Creation--------");
//       // hobbyDAOImpl.insertRecord(111,"Zara1");
//       // hobbyDAOImpl.create(21,"Nuha1");
//       // hobbyDAOImpl.create(115,"Ayan1");
//
//     //   System.out.println("------Listing Multiple Records--------");
//        //List<Hobby> hobbies = hobbyDAOImpl.listHobbies();
//       // for (Hobby record : hobbies) {
//       //     System.out.print("ID : " + record.getId());
//       //     System.out.print(", Name : " + record.getName());
//     //   }
//
//     //   System.out.println("----Updating Record with ID = 2 -----");
//     //   hobbyDAOImpl.update(21, "sindhu");
//        
//      //  System.out.println("----Listing Record with ID = 2 -----");
//      //  Hobby hobby = hobbyDAOImpl.getHobby("Music");
//    //    System.out.print("ID : " + hobby.getId());
//    //    System.out.print(", Name : " + hobby.getName());
//        
//        List<String> names = hobbyDAOImpl.listHobbyNames();
//        for(String name : names){
//            System.out.println(name);
//            
//        }
//
//    }
	
	System.out.println("Maven + Hibernate Annotation + MySQL");
	HibernateUtil.createSessionFactory();
	Session session = HibernateUtil.getSessionFactory().openSession();

	session.beginTransaction();
	Hobby hobby = new Hobby();

	hobby.setId(100);
	hobby.setCategory("Music");
	hobby.setSpecialization("Vocal");
	hobby.setEmail("test@gmail.com");
	hobby.setName("music");
	hobby.setState("CA");
	hobby.setCity("foster city");
	

	session.save(hobby);
	session.getTransaction().commit();
	}
}
