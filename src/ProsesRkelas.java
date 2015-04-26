import java.util.Scanner;


public class ProsesRkelas {
	Scanner sir = new Scanner(System.in);
	RuangKelas baru = new RuangKelas();
	
	void IdentifiRkelas(){
		System.out.println("Nama Ruang : ");
		baru.setNamaRuang(sir.nextLine());
		System.out.println("Lokasi : ");
		baru.setLokasi(sir.nextLine());
		System.out.println("Fakultas : ");
		baru.setFakultas(sir.nextLine());
		System.out.println("Program Studi : ");
		baru.setProdi(sir.nextLine());
	}
	void KondisiRkelas(){
		System.out.println("Panjang Ruang : ");
		baru.setPanjang(sir.nextDouble());
		System.out.println("Lebar Ruang : ");
		baru.setLebar(sir.nextDouble());
		System.out.println("Jumlah Pintu : ");
		baru.setJumlahPintu(sir.nextDouble());
		System.out.println("Jumlah Jendela : ");
		baru.setJumlahJendela(sir.nextDouble());
		System.out.println("Jumlah Kursi : ");
		baru.setJumlahSteker(sir.nextDouble());
		System.out.println("Jumlah Kabel LCD : ");
		baru.setJmlKabelLCD(sir.nextDouble());
		System.out.println("Jumlah Lampu : ");
		baru.setJumlahLampu(sir.nextDouble());
		System.out.println("Jumlah AC : ");
		baru.setJumlahAC(sir.nextDouble());
		
	}
	
	double HitungLuas(){
		return baru.getPanjang()*baru.getLebar();
	}
	
	double HitungRasio(){
		return HitungLuas()/baru.getJumlahKursi();
	}
}
