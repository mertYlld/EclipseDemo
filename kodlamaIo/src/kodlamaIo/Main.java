package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		KampOzellikleri kampOzellikleri1 = new KampOzellikleri(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR)", "Engin Demiro�");
		
		
		KampOzellikleri kampOzellikleri2 = new KampOzellikleri(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(jAVA + REACT)", "Engin Demiro�");
		
		
		KampOzellikleri kampOzellikleri3 = new KampOzellikleri(3,"Programlamaya Giri� ��in Temel Kurs","Engin Demiro�" );
		
		KampOzellikleri kampOzellikleri4 = new KampOzellikleri(4, "Phyton", "Engin Demiro�");
		
		
		KampOzellikleri[] kampOzellikleri = {kampOzellikleri1, kampOzellikleri2, kampOzellikleri3};
		for(KampOzellikleri kampOzellik : kampOzellikleri)
		{
			System.out.println(kampOzellik.id + ". " + kampOzellik.KampName + "\n" + kampOzellik.Egitmen);
		}
		
		System.out.println(" ");
		
		//Kampa Kay�t Ol Methodu
		KayitOl kay�tOl = new KayitOl();
		kay�tOl.registered(kampOzellikleri1);
		kay�tOl.registered(kampOzellikleri2);
		kay�tOl.registered(kampOzellikleri3);
		
		System.out.println(" ");
		
		//Sisteme Yeni kamp Ekleme 
		NewCampAdd newCampAdd = new NewCampAdd();
		newCampAdd.add(kampOzellikleri4);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
