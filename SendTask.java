public class SendTask {
		private String no;
		private  double heavy;
		public SendTask()
		{
			
		}
		public SendTask(String no,double heavy)
		{
			this.no=no;
			this.heavy=heavy;
		}
		public void setNo(String no) 
		{
			this.no = no;
		}
		public String getNo()
		{
			return no;
		}
		public double getHeavy()
		{
			return heavy;
		}
		public void setHeavy(double heavy) 
		{
			this.heavy = heavy;
		}
		public String sendBefore() 
		{
			return "订单开始处理,仓库开始验货...\n"+"货物重量:"+this.heavy+"kg\n订单已发货\n快递单号："+this.no;
		}
		public String send(Transportation t,GPS tool){
			return "运货人"+t.getName()+"正在驾驶编号为"+t.getNo()+"的"+t.getSize()+"发送货物\n京东快递运输中...\n"+tool.showCoordinate();
		}
		public String sendAfter(Transportation t,baoyang a){
			return "货物运输已完成\n"+"运货人"+t.getName()+"正在驾驶编号为"+t.getNo()+"的"+t.getSize()+"已归还!"+a.show();
		}
	}

