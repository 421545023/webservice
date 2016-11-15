package com.local.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.local.client.IBankService;
import com.local.client.IBankServiceService;


public class Demo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		IBankService ibs = new IBankServiceService().getIBankServicePort();
		String paramXml ;
		String files ;		
		Map file = new HashMap();
		file.put("datatype", "01");
		file.put("bustype", "01");
		file.put("filecode", "012152");
		file.put("filepath", "f:");
		Map map = new HashMap();
		map.put("txcode", "CSPCA001");
		map.put("certcode", "39008A8B0FEDC1E53DF5E7AF76B76909");
		map.put("txchannel", "2");
		map.put("source", "01");
		map.put("forgcode", "5510313");
		map.put("torgcode", "5510cs");
		map.put("curname", "li");
		map.put("curcodetype", "99");
		map.put("curcodeno", "421545");
		map.put("curphone", "13152151215");
		map.put("curdepcode", "010910201");
		map.put("rescode", "1");
		map.put("resmsg", "22313");
		paramXml = MapToString(map,file).toString();
		String str = ibs.doBankService(paramXml);
		System.out.println(str);
	}
	private static StringBuffer MapToString(Map map,Map file){
		StringBuffer sb = new StringBuffer();
		sb.append("<data>").append("\n");
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
		    Object key = entry.getKey();
		    Object value = entry.getValue();
		    sb.append("<").append(key).append(">")
		    .append(value).
		    append("</").append(key).append(">").append("\n");
		}
		sb.append("<filelist>").append("\n");
		it = file.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			Object	key = entry.getKey();
			Object	value = entry.getValue();
			sb.append("<").append(key).append(">")
			.append(value)
			.append("</").append(key).append(">").append("\n");
		}
		sb.append("</filelist>").append("\n").append("</data>");
		return sb;
	}
}
