
public class JDTransportation extends Transportation {
	public JDTransportation(String name, String no, String size) {
		super(name,no,size);
	}
	public String transport(){
		return "运货人:"+getName()+"正在驾驶编号为"+getNo()+"的"+getSize()+"发送货物";
	}
}
