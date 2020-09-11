
public class twoDArray {

	public static void main(String[] args) {
		int array[][]=new int[4][4];  //4X4 2차원 배열 생성
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[i].length;j++)
				array[i][j]=0;  //배열의 모든 원소를 0으로 초기화.
		
		
		for(int count=0;count<10;) { //배열에 랜덤숫자 10개가 저장될 때까지 반복
			int r=(int)(Math.random()*10+1);//랜덤한 정수 생성
			int i=(int)(Math.random()*4); //배열의 행 인덱스 랜덤하게 생성
			int j=(int)(Math.random()*4); //배열의 열 인덱스 랜덤하게 생성

			if(array[i][j]!=0); //배열 원소가 0이 아니면 이미 값이 저장된 원소이므로 건너뜀
			else { //그렇지 않다면(해당 위치의 원소가 0이라면) 랜덤숫자(1~10) 저장
				array[i][j]=r;
				count++; //생성된 숫자 갯수 증가
			}
		
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++)
				System.out.print(array[i][j]+"     ");//2차원 배열 출력
			System.out.print("\n");
		}
	}

}
