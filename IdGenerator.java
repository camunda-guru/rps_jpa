package com.cts.banking.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class IdGenerator implements IdentifierGenerator{
	public int generateStockId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
 
   
	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
		// TODO Auto-generated method stub
		 Date date = new Date();
         
	        Calendar calendar = Calendar.getInstance();
	        return "ST_" + this.generateStockId() + "_" + calendar.get(Calendar.YEAR);
	}
}
