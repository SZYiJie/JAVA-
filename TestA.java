import java.util.Random;
public class TestA {

	public static void main(String[] args) {
		Random rand = new Random();
		int a=rand.nextInt(600);
		int b=rand.nextInt(600);
		SendTask sendtask=new SendTask("hx201835",13.2);
		Transportation transportation=new JDTransportation("§³","zh1002","");
		GPS gps=new Phone(a,b);
		System.out.println(sendtask.sendBefore());
		System.out.println();
		System.out.println(sendtask.send(transportation, gps));
		System.out.println();
		System.out.println(sendtask.sendAfter(transportation, null));

	}

}