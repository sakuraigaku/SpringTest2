package jp.tuyano.spring.aop1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyBean1 implements IMyBean<List<String>> {
	private List<String>data = new ArrayList<String>();
	private Date date = Calendar.getInstance().getTime();

	public void setDataObject(List<String> obj) {
		data=obj;
	}

	public List<String> getDataObject() {
		return data;
	}

	public void appData(Object obj) {
		data.add(obj.toString());
	}

	public String toString() {
		String result = "MyBean1 [data=";
		for (String s : data) {
			result += s+", ";
		}
		SimpleDateFormat  fm = new SimpleDateFormat("yyyy-MM-dd");
		result+="date="+fm.format(date) + "]";
		return result;
	}

}
