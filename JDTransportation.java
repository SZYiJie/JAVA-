
public class JDTransportation extends Transportation {
	public JDTransportation(String name, String no, String size) {
		super(name,no,size);
	}
	public String transport(){
		return "�˻���:"+getName()+"���ڼ�ʻ���Ϊ"+getNo()+"��"+getSize()+"���ͻ���";
	}
}
