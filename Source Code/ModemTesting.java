
interface Modem {
  public boolean open();                               
  public boolean close();
  public int read ();
  public int write();

}

//........................................................................

class MindStickModem implements Modem {
                     public boolean open() {
                        // implementation
			System.out.println("\n");
			System.out.println("Starting a MindStickModem\n");
			return true;

                     }

                     public boolean close() {

                             // implementation
			System.out.println("Closing a MindStickModem\n");
			System.out.println(".......................................................................................\n");
			return false;

                     }

                     public int read() {

                             // implementation
			System.out.println("Reading a MindStickModem\n");
			return 100;

                     }

                     public int write() {

                             // implementation
			System.out.println("Writing a MindStickModem\n");
			return 100;

                     }

}


class HuaweiModem implements Modem {

                     public boolean open() {

                             // implementation
			System.out.println("Starting a HuaweiModem\n");
			return true;

                     }

                     public boolean close() {

                             // implementation
			System.out.println("Closing a HuaweiModem\n");
			return false;

                     }

                     public int read() {

                             // implementation
			System.out.println("Reading a HuaweiModem\n");
			return 500;


                     }

                     public int write() {

                             // implementation
			System.out.println("Writing a HuaweiModem\n");
			return 500;

                     }


}

public class ModemTesting {

	public static void main(String[] args) {


		Modem modem1 = new MindStickModem();
		modem1.open();
		modem1.write();
		modem1.read();
		modem1.close();
 

		Modem modem2 = new HuaweiModem();
		modem2.open();
		modem2.write();
		modem2.read();
		modem2.close();

	}
}