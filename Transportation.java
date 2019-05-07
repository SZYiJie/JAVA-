

	public abstract class Transportation {
		private String no;
		private String size;
		private String name;
		public Transportation(){
			
		}
		public Transportation(String name,String no,String size){
			this.name=name;
			this.no=no;
			this.size=size;
			
		}
		public String getNo() {
			return no;
		}
		public void setNo(String no) {
			this.no = no;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public abstract String transport();
	}

