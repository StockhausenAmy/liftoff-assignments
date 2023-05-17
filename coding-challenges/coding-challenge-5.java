public class Program {
    public static int addUp(int num) {
      int total = 0;
			for (int i = num; i >= 0; i--){
				total = total + i;
			}
			return total;
    }
}
