
public class twoDArray {

	public static void main(String[] args) {
		int array[][]=new int[4][4];  //4X4 2���� �迭 ����
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[i].length;j++)
				array[i][j]=0;  //�迭�� ��� ���Ҹ� 0���� �ʱ�ȭ.
		
		
		for(int count=0;count<10;) { //�迭�� �������� 10���� ����� ������ �ݺ�
			int r=(int)(Math.random()*10+1);//������ ���� ����
			int i=(int)(Math.random()*4); //�迭�� �� �ε��� �����ϰ� ����
			int j=(int)(Math.random()*4); //�迭�� �� �ε��� �����ϰ� ����

			if(array[i][j]!=0); //�迭 ���Ұ� 0�� �ƴϸ� �̹� ���� ����� �����̹Ƿ� �ǳʶ�
			else { //�׷��� �ʴٸ�(�ش� ��ġ�� ���Ұ� 0�̶��) ��������(1~10) ����
				array[i][j]=r;
				count++; //������ ���� ���� ����
			}
		
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++)
				System.out.print(array[i][j]+"     ");//2���� �迭 ���
			System.out.print("\n");
		}
	}

}
