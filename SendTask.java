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
			return "������ʼ����,�ֿ⿪ʼ���...\n"+"��������:"+this.heavy+"kg\n�����ѷ���\n��ݵ��ţ�"+this.no;
		}
		public String send(Transportation t,GPS tool){
			return "�˻���"+t.getName()+"���ڼ�ʻ���Ϊ"+t.getNo()+"��"+t.getSize()+"���ͻ���\n�������������...\n"+tool.showCoordinate();
		}
		public String sendAfter(Transportation t,baoyang a){
			return "�������������\n"+"�˻���"+t.getName()+"���ڼ�ʻ���Ϊ"+t.getNo()+"��"+t.getSize()+"�ѹ黹!"+a.show();
		}
	}

