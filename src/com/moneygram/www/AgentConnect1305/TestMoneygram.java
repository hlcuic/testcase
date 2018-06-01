package com.moneygram.www.AgentConnect1305;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TestMoneygram {
	public static void main(String[] args) throws ServiceException, RemoteException {
		AgentConnectServiceLocator location = new AgentConnectServiceLocator();
		AgentConnectBindingStub service = (AgentConnectBindingStub) location.getPort(AgentConnectBindingStub.class);
		service.feeLookup(new FeeLookupRequest());
	}
}
