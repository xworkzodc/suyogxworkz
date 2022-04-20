package com.xworkz.criminals;

public class CriminalRunner {

	public static void main(String[] args) {
		
		CriminalDAO dao = new CriminalDAO();
		
		CriminalService criminalservice = new CriminalService(dao);
		criminalservice.setDao(dao);
		
		CriminalDTO dto = new CriminalDTO();
		dto.setId(600);
		dto.setName("Yerwada");
		dto.setOffense("Robbery");
		dto.setImprisonment(4);
		dto.setJailName("Yerwada Pune");
		
		
		criminalservice.validateAndSave(dto);

	}

}
