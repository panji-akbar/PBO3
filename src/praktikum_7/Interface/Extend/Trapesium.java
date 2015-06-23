package praktikum_7.Interface.Extend;


public class Trapesium {
	
	public interface BentukInterface {
		
		public static final double PHI = 3.14;
		public void tulis();
	}
	
	public interface HitungKeliling extends BentukInterface {
		public double hitungKeliling();
	}
	
	public interface HitungLuas extends BentukInterface {
		public double hitungLuas();
	}
	
	public abstract  class lingkaran implements HitungKeliling,HitungLuas {
		private double jariJari;
		
			public lingkaran(double jariJari) {
				this.jariJari = jariJari;
			}
	}

}
