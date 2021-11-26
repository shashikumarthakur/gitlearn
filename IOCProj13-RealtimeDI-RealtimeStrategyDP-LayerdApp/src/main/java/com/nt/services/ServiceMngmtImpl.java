package com.nt.services;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAOImpl;
import com.nt.dao.CustomerDAOInterf;
import com.nt.dto.CustomerDTO;

public class ServiceMngmtImpl implements ServiceMngmtInfer {

	private CustomerDAOImpl dao;
	public ServiceMngmtImpl(CustomerDAOImpl dao) {
		this.dao = dao;
	}
	@Override
	public String calculateInterestAmt(CustomerDTO dto) throws Exception {
		float interamt=0.0f;
		CustomerBO bo=null;
		int count=0;
		float totle_paid_amt=0.0f;
		
		interamt=(dto.getPamt()*dto.getRate()*dto.getTime())/100;
		totle_paid_amt = interamt+dto.getPamt();
		bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setInteramt(interamt);
		//use dao
		count=dao.insert(bo);
		
		if(count==0)
			return "Insertion Failed"+dto.getPamt()+" Intersest Amount"+interamt;
		else
			return "Insertion Successfull: "+dto.getPamt()+" Intersest Amount: "+interamt+" totle_paid_amt: "+totle_paid_amt;
	}

}
