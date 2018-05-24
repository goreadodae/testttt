package kh.team.select;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class TestMain {
	
	public static void main(String[] args) {
		String student[] = {"김지섭","곽영훈","김미경","장재형","이민국","황준상","김정현","정지수","안형조","이다혜",
				"한아름","류훈형","심인보","이창호","황지현","박혜윤","김지은","정경호","황누리","한소원","진소정","김예진",
				"이승재","한영진","홍성민","전선범","김준석","고민호"};
		Random r = new Random();
		ArrayList <String> team = new ArrayList<String>();
		HashSet <Integer>number = new HashSet<Integer>();
		while(number.size()<28) {
			int n = r.nextInt(28);
			if(!number.contains(n)) {
				team.add(student[n]);
				number.add(n);
			}
		}
		for(int i=0;i<team.size()/7;i++) {
			System.out.print((i+1)+"팀 : ");
			for(int j=0;j<7;j++){
				System.out.print(team.get(i*7+j)+"\t");
			}
			System.out.println("\n");
		}
	}

}
