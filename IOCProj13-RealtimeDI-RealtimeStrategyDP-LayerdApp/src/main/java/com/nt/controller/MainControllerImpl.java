package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.services.ServiceMngmtImpl;
import com.nt.vo.CustomerVO;

public class MainControllerImpl implements MainController {

	private ServiceMngmtImpl service;
	
	public MainControllerImpl(ServiceMngmtImpl service) {
		this.service = service;
	}
	@Override
	public String ProccessCustomer(CustomerVO vo) throws Exception {
		CustomerDTO dto=null;
		String result=null;
		dto=new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		result=service.calculateInterestAmt(dto);
		
		return result;
	}

}
