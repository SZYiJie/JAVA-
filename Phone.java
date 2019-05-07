public class Phone implements GPS{
		private int x,y;
		public Phone(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		public void setX(int X)
		{
			this.x=X;
		}
		public void setY(int Y)
		{
			this.y=Y;
		}
		public int getX()
		{
			return x;
		}
		public int getY()
		{
			return y;
		}
		public String showCoordinate(){
			return "货物当前坐标为:"+x+","+y;
		}
	}

