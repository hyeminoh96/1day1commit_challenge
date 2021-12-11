package test;

import java.util.Scanner;
import java.util.Arrays;


//보너스 번호 체크 여부 다시 확인 ex) 보너스 번호 일치 1개 + 당첨번호 2개  = 3개 얘는 5등담청이 아니다. 보너스번호일치여부 따로 확인및 체크하는 변수 선헌.
public class Solution {
	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\\sample_input.txt"));

		int[] chk = {7, 37, 38,39, 40, 44, 18}; // 655회차 당첨번호
		
		//테스트 케이스당 누적 당첨금 초기화
		int tmoney = 0;
		
		//T 입력받아서 저장
		Scanner inputT = new Scanner(System.in);
		int T = inputT.nextInt() ; //!!!!!제출할 때 -1 빼기
		
		//N을 T번 입력받기
		for(int j=0; j<=T; j++) {
			
			//세트 N당 누적 당첨금 초기화
			int nmoney = 0;

			//N 입력받아서 저장
			Scanner inputN = new Scanner(System.in);
			int N = inputN.nextInt();

			//배열a를 N번 입력받기
			//이퀄 제거해야함 !!!
			for(int k=0; k<N; k++) {	

				// 게임당 당첨금 초기화
				int gmoney = 0; 

				//번호 들어갈 배열 선언
				int[] a = new int[6];

				//배열 입력받기
				Scanner inputnum = new Scanner(System.in);
				for(int i=0; i<a.length; i++) {

					a[i] = inputnum.nextInt();
					
					// 당첨번호 개수 초기화
					int cnt = 0;
					// 한 게임당 일치하는 번호 몇 개?
					for(int l = 0; l<a.length; l++) {
						for(int m=0; m<chk.length; m++) {
							if(a[l] == chk[m]) {
								cnt++;
							}
						}
					}
					if(cnt == 3) { //5등 5,000원
						gmoney = gmoney + 5000;
					}
					else if(cnt == 4) { //4등 50,000원
						gmoney = gmoney + 50000;
					}
					else if(cnt == 5) { //보너스번호로 2등, 3등 검증
						gmoney = gmoney + 1547926;
					}
					else if(cnt == 6) { //1등 16억6143만9625원 
						for(int p = 0; p<a.length; p++) {
							if(a[p] == 18) { //보너스번호 포함하는 경우 3등 154만7926원
								gmoney = gmoney + 60784377;
							}
							else { // 2등 6078만4377원
								gmoney = gmoney + 1661439625;
							}
						}
						
					}
					else 
						break;
				} // end of one game (array 'a')
				nmoney = nmoney + gmoney; //세트당 당첨금에 한 게임 당첨금 합산
			} // end of a game set N
			tmoney = tmoney + nmoney; // 테스트케이스당 누적 당첨금에 게임셋 당첨금 합산
		} //end of a test case T
		System.out.println("#"+T+" "+tmoney);
	} //end of main function
} //end of class solution


