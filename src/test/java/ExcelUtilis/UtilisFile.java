package ExcelUtilis;




	import org.apache.poi.xssf.usermodel.*;

	import java.io.*;

	import java.util.List;
	 
	public class UtilisFile  {	
		public static String path;
		public static FileOutputStream file;
		public static XSSFWorkbook wb;
		public static XSSFSheet s;
		public static XSSFSheet s1;
	public static void excelInit() throws FileNotFoundException
	{
		
		UtilisFile .path = System.getProperty("user.dir")+"\\Excel\\news.xlsx";
		UtilisFile .file = new FileOutputStream(path);

		UtilisFile .wb = new XSSFWorkbook();
		
		UtilisFile .s = UtilisFile .wb.createSheet("Sheet1");
		UtilisFile .s1 = UtilisFile .wb.createSheet("Sheet2");

	}
	public static void saveDataToExcel(List<String> name, List<String> price) throws FileNotFoundException {
		UtilisFile .excelInit();
			
						XSSFRow row1 = UtilisFile .s.createRow(0);

						row1.createCell(0).setCellValue("NAME");
						row1.createCell(1).setCellValue("PRICE");
						for(int r=1;r<4;r++) {

							XSSFRow row = UtilisFile .s.createRow(r);
							row.createCell(0).setCellValue(name.get(r-1));
							row.createCell(1).setCellValue(price.get(r-1));
						}
					}
	public static void saveDataToExcel2(List<String> items) throws FileNotFoundException {
			
						XSSFRow row1 = UtilisFile .s1.createRow(0);

						row1.createCell(0).setCellValue("ITEMS");
					
						for(int r=1;r<12;r++) {

							XSSFRow row = UtilisFile .s1.createRow(r);
							row.createCell(0).setCellValue(items.get(r-1));
							
						}
					}


			


	public static void closeExcel() throws IOException
	{

		UtilisFile .wb.write(file);

		UtilisFile .wb.close();

		UtilisFile .file.close();
		
	}
}
