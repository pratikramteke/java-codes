class DoctorTestDrive{
	public static void main(String args[]){
		Surgean s=new Surgean();
		s.treatpatient();
		s.operate();
		FamilyDoctor f=new FamilyDoctor();
		f.treatpatient();
		f.giveadvice();
	}
}
