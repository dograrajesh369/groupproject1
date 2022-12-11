package Main;
import java.util.Scanner;
import com.gl.Admindept.Admindepartment;
import com.gl.Hrdept.Hr;
import com.gl.Superdept.superclass;
import com.gl.Techdept.Tech;

public class Driver {
		Scanner sc= new Scanner(System.in);
		Admindepartment adim = new Admindepartment();
		Hr hr = new Hr();
		superclass Super =new superclass();
		static Tech tech = new Tech();
		
		public static void main(String[] args) {
			Admindepartment admin = new Admindepartment();
			System.out.println("Welcome to "+admin.departmentName());
			System.out.println(admin.getTodaysWork());
			System.out.println(admin.getWorkDeadline());
			System.out.println(admin.isTodayAHoliday());
			System.out.println();
			
			Hr hr = new Hr();
			System.out.println("Welcome to "+hr.departmentName());
			System.out.println(hr.doActivity());
			System.out.println(hr.getTodaysWork());
			System.out.println(hr.getWorkDeadline());
			System.out.println(hr.isTodayAHoliday());
			System.out.println();
			
			Tech tech = new Tech();
			System.out.println("Welcome to "+tech.departmentName());
			System.out.println(tech.getTodaysWork());
			System.out.println(tech.getWorkDeadline());
			System.out.println(tech.getTechStackInformation());
			System.out.println(tech.isTodayAHoliday());
			
	}
	

}
