
public class TestRuangKelas {
	public static void main(String[] auch){
		ProsesRkelas digin = new ProsesRkelas();
		digin.IdentifiRkelas();
		digin.KondisiRkelas();
		
		System.out.println("Luas Ruang = "+digin.HitungLuas());
		System.out.println("Rasio Ruang = "+digin.HitungRasio());
	}
}
