package 연습;// @ author ninaaano

import java.util.Scanner;

public class 두수비교하기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
         */
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);

		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
         */
    }
}