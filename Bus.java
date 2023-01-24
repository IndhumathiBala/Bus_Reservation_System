package busReser;

public class Bus {
		private int busNo;
		private boolean ac;
		private int capacity;
		Bus(int no,Boolean ac,int cap)
		{
			this.busNo=no;
			this.ac=ac;
			this.capacity=cap;
		}
		
		//set -->mutator    get-->accessor
		public int getBusNo() {
			return busNo;
		}
		
		
		public void setBusNo(int busNo) {
			this.busNo = busNo;
		}
		
		public boolean isAc() {
			return ac;
		}
		
		public void setAc(boolean ac) {
			this.ac = ac;
		}
		
		public int getCapacity() {
			return capacity;
		}
		
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public void displayInfo()
		{
			System.out.println("Bus No: "+busNo+" "+"AC Facility: "+ac+" "+"Capacity of the bus "+capacity);
		}
		
}
