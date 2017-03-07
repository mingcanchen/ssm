package com.ming.ssm.framework.thrift.proxy;

import java.util.Map;


public class DynamicClientProxyFactory {

	/**
	 *
	 * @param clazzIfaceName
	 * @param host
	 * @param serverName
	 * @return
	 */
	public static Object createIface(String clazzIfaceName, String host, String serverName) {

		try {
			
			String clazzClientName = clazzIfaceName + "$Client";
			
			Class clientClazz = Class.forName(clazzClientName);
			
			DynamicClientProxy proxy = new DynamicClientProxy();
			
			return proxy.createProxy(clientClazz, host, serverName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
	
	
	
	public static Object createIface(String clazzIfaceName, String host, String serverName, Map<String,String> methodNames) {

		try {
			
			String clazzClientName = clazzIfaceName + "$Client";
			
			Class clientClazz = Class.forName(clazzClientName);
			
			DynamicClientProxy proxy = new DynamicClientProxy();
			
			return proxy.createProxy(clientClazz, host, serverName, methodNames);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

}
