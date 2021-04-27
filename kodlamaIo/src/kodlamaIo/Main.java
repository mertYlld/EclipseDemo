package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		KampOzellikleri kampOzellikleri1 = new KampOzellikleri(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)", "Engin Demiroð");
		
		
		KampOzellikleri kampOzellikleri2 = new KampOzellikleri(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(jAVA + REACT)", "Engin Demiroð");
		
		
		KampOzellikleri kampOzellikleri3 = new KampOzellikleri(3,"Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiroð" );
		
		KampOzellikleri kampOzellikleri4 = new KampOzellikleri(4, "Phyton", "Engin Demiroð");
		
		
		KampOzellikleri[] kampOzellikleri = {kampOzellikleri1, kampOzellikleri2, kampOzellikleri3};
		for(KampOzellikleri kampOzellik : kampOzellikleri)
		{
			System.out.println(kampOzellik.id + ". " + kampOzellik.KampName + "\n" + kampOzellik.Egitmen);
		}
		
		System.out.println(" ");
		
		//Kampa Kayýt Ol Methodu
		KayitOl kayýtOl = new KayitOl();
		kayýtOl.registered(kampOzellikleri1);
		kayýtOl.registered(kampOzellikleri2);
		kayýtOl.registered(kampOzellikleri3);
		
		System.out.println(" ");
		
		//Sisteme Yeni kamp Ekleme 
		NewCampAdd newCampAdd = new NewCampAdd();
		newCampAdd.add(kampOzellikleri4);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
