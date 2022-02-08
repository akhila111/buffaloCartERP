package dataProviders;

import org.testng.annotations.DataProvider;

import utils.ReadExcelFile;

public class GetUsersData {

	@DataProvider(name = "UserLogin")
	public Object[][] Authentication() throws Exception {
		Object[][] testObjArray = ReadExcelFile.getDataFromExcel(
				"D://Akhila//Workspace//LiveProject//buffaloCartERP//src//test//resources//TestData.xlsx",
				"Sheet1");
		return (testObjArray);

	}
}
