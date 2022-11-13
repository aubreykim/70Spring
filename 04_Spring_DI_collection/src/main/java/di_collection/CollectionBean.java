package di_collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	private List<String> addressList;
	private Set<String> addressSet;
	private Map<String, String> addressMap;
	private Properties addressProp;
	// Map과 유사 K, V로 데이터 관리 대신 Key도 String, values도 String
	// String, String이 아닌 다른 데이터 타입 저장 불가능
	
	public CollectionBean() {
		System.out.println(">> CollectionBean() 객체 생성");
	}

	
	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}


	public Set<String> getAddressSet() {
		return addressSet;
	}


	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}


	public Map<String, String> getAddressMap() {
		return addressMap;
	}


	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}


	public Properties getAddressProp() {
		return addressProp;
	}


	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	
	
	
	
	
}
