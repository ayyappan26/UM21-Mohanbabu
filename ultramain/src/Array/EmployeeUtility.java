package Array;

public class EmployeeUtility {private static Scanner sc;
private EmployeeUtility() {}
public static Scanner getScannerInstance() {
	if(sc==null) {
		sc=new Scanner(System.in);
	}
	return sc;
}
}


