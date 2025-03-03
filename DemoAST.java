
public class DemoAST {
	int bart(int x) { return x+1; }
	int lisa(int x) { return x+2; }

	int homer(int x) {
		int y, a, b;

		if(x>0) {
			y = 0;
		} else {
			a = bart(1);
			b = lisa(2);
			y = a + b;
		}
		return y;
	}

}
