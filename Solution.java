package test;

import java.util.Scanner;
import java.util.Arrays;


//���ʽ� ��ȣ üũ ���� �ٽ� Ȯ�� ex) ���ʽ� ��ȣ ��ġ 1�� + ��÷��ȣ 2��  = 3�� ��� 5���û�� �ƴϴ�. ���ʽ���ȣ��ġ���� ���� Ȯ�ι� üũ�ϴ� ���� ����.
public class Solution {
	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\\sample_input.txt"));

		int[] chk = {7, 37, 38,39, 40, 44, 18}; // 655ȸ�� ��÷��ȣ
		
		//�׽�Ʈ ���̽��� ���� ��÷�� �ʱ�ȭ
		int tmoney = 0;
		
		//T �Է¹޾Ƽ� ����
		Scanner inputT = new Scanner(System.in);
		int T = inputT.nextInt() ; //!!!!!������ �� -1 ����
		
		//N�� T�� �Է¹ޱ�
		for(int j=0; j<=T; j++) {
			
			//��Ʈ N�� ���� ��÷�� �ʱ�ȭ
			int nmoney = 0;

			//N �Է¹޾Ƽ� ����
			Scanner inputN = new Scanner(System.in);
			int N = inputN.nextInt();

			//�迭a�� N�� �Է¹ޱ�
			//���� �����ؾ��� !!!
			for(int k=0; k<N; k++) {	

				// ���Ӵ� ��÷�� �ʱ�ȭ
				int gmoney = 0; 

				//��ȣ �� �迭 ����
				int[] a = new int[6];

				//�迭 �Է¹ޱ�
				Scanner inputnum = new Scanner(System.in);
				for(int i=0; i<a.length; i++) {

					a[i] = inputnum.nextInt();
					
					// ��÷��ȣ ���� �ʱ�ȭ
					int cnt = 0;
					// �� ���Ӵ� ��ġ�ϴ� ��ȣ �� ��?
					for(int l = 0; l<a.length; l++) {
						for(int m=0; m<chk.length; m++) {
							if(a[l] == chk[m]) {
								cnt++;
							}
						}
					}
					if(cnt == 3) { //5�� 5,000��
						gmoney = gmoney + 5000;
					}
					else if(cnt == 4) { //4�� 50,000��
						gmoney = gmoney + 50000;
					}
					else if(cnt == 5) { //���ʽ���ȣ�� 2��, 3�� ����
						gmoney = gmoney + 1547926;
					}
					else if(cnt == 6) { //1�� 16��6143��9625�� 
						for(int p = 0; p<a.length; p++) {
							if(a[p] == 18) { //���ʽ���ȣ �����ϴ� ��� 3�� 154��7926��
								gmoney = gmoney + 60784377;
							}
							else { // 2�� 6078��4377��
								gmoney = gmoney + 1661439625;
							}
						}
						
					}
					else 
						break;
				} // end of one game (array 'a')
				nmoney = nmoney + gmoney; //��Ʈ�� ��÷�ݿ� �� ���� ��÷�� �ջ�
			} // end of a game set N
			tmoney = tmoney + nmoney; // �׽�Ʈ���̽��� ���� ��÷�ݿ� ���Ӽ� ��÷�� �ջ�
		} //end of a test case T
		System.out.println("#"+T+" "+tmoney);
	} //end of main function
} //end of class solution


