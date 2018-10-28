package jp.tuyano.spring.aop1;

public interface IMyBean<T> {
	public void setDataObject(T obj) ;
	public T getDataObject();
	public void appData(Object obj) ;
	public String toString();
}
