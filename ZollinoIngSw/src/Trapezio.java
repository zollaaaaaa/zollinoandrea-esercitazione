
/**
 * 
 * @author <mark>ZOLLINO</mark>
 * 
 *<U> TRAPEZIO </U>
 */

public class Trapezio {
/**
 * @param bm mase minore 
 * @param bM base magggiore
 * @param h altezza
 * @param l lati
 */
	private float bm, bM, h, l;
/**
 * costruttore contenente i lati del trapezio
 */
	public Trapezio(float bm, float bM, float h, float l) {
		this.bm = bm;
		this.bM = bM;
		this.h = h;
		this.l = l;
		//ciao
	}
/**
 * metodo che calcola il perimetro
 * @return
 */
	public float perimetro() {
		return bm + bM + (2 * l);
	}
/**
 * metodo che calcola l'area
 */
	public float area() {
		return (bm+bM)*h/2;
	}

	public static void main(String[] args) {
		Trapezio q = new Trapezio(1, 2, 3, 4);
		System.out.println(q.perimetro());
		System.out.println(q.area());
	}
}
