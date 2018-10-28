package jp.tuyano.spring.aop1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyBean2 implements IMyBean<List<Integer>> {
	private List<Integer>data=new ArrayList<Integer>();
	private Date date = Calendar.getInstance().getTime();

	public void setDataObject(List<Integer> obj) {
		data=obj;
	}

	public List<Integer> getDataObject() {
		return data;
	}

	public void appData(Object obj) {
		// TODO 自動生成されたメソッド・スタブ
		data.add(Integer.parseInt(obj.toString()));
	}

	public String toString() {
		String result="MyBean1 [data=";
		for (Integer n : data) {
			result += n + ", ";
		}
		SimpleDateFormat fm=new SimpleDateFormat("yyyy-MM-dd");
		result += "date="+fm.format(date)+"]";
		return result;

	}

}
