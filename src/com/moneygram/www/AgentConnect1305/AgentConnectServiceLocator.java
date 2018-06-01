/**
 * AgentConnectServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class AgentConnectServiceLocator extends org.apache.axis.client.Service implements com.moneygram.www.AgentConnect1305.AgentConnectService {

    public AgentConnectServiceLocator() {
    }


    public AgentConnectServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgentConnectServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AgentConnect
    private java.lang.String AgentConnect_address = "https://extws.moneygram.com/extws/services/AgentConnect1305";

    public java.lang.String getAgentConnectAddress() {
        return AgentConnect_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AgentConnectWSDDServiceName = "AgentConnect";

    public java.lang.String getAgentConnectWSDDServiceName() {
        return AgentConnectWSDDServiceName;
    }

    public void setAgentConnectWSDDServiceName(java.lang.String name) {
        AgentConnectWSDDServiceName = name;
    }

    public com.moneygram.www.AgentConnect1305.AgentConnect getAgentConnect() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AgentConnect_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAgentConnect(endpoint);
    }

    public com.moneygram.www.AgentConnect1305.AgentConnect getAgentConnect(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.moneygram.www.AgentConnect1305.AgentConnectBindingStub _stub = new com.moneygram.www.AgentConnect1305.AgentConnectBindingStub(portAddress, this);
            _stub.setPortName(getAgentConnectWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAgentConnectEndpointAddress(java.lang.String address) {
        AgentConnect_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.moneygram.www.AgentConnect1305.AgentConnect.class.isAssignableFrom(serviceEndpointInterface)) {
                com.moneygram.www.AgentConnect1305.AgentConnectBindingStub _stub = new com.moneygram.www.AgentConnect1305.AgentConnectBindingStub(new java.net.URL(AgentConnect_address), this);
                _stub.setPortName(getAgentConnectWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AgentConnect".equals(inputPortName)) {
            return getAgentConnect();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "AgentConnectService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "AgentConnect"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AgentConnect".equals(portName)) {
            setAgentConnectEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
