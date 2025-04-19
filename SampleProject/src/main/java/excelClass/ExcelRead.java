package excelClass;

import java.io.IOException;

public class ExcelRead {

		public static void main(String[] args) throws IOException {
			/*String var = ExcelMain.getStringData(1, 0);
			System.out.println(var);
			System.out.println(ExcelMain.getIntegerData(1, 1));
			String var1 = ExcelMain.getStringData(2, 0);
			System.out.println(var1);
			System.out.println(ExcelMain.getIntegerData(2, 1));
			String var2 = ExcelMain.getStringData(3, 0);
			System.out.println(var2);
			System.out.println(ExcelMain.getIntegerData(3, 1));*/
			for (int i = 1; i <= 3; i++) 
			{
	            String var = ExcelMain.getStringData(i, 0);
	            String mark = ExcelMain.getIntegerData(i, 1);
	            System.out.println("Name: " + var + ", Mark: " + mark);
	        }


			// TODO Auto-generated method stub

		}

	
		// TODO Auto-generated method stub

	}


