package quiz17;
public class MelonMusic implements SongList {

	private String[] list = new String[100];
	private int count = 0;
	@Override
	public void insertList(String song) {
		list[this.count] = song;
		this.count++;
		System.out.println(song + "가(이) 리스트에 추가 되었습니다");
	}
	@Override
	public void playList() {
		for (int i = 0; i < count; i++) {
			int rand = (int)(Math.random() * this.count);
			System.out.println(list[rand]);
		}
		
	}
	@Override
	public int playLength() {
		for (int i = 0; i < list.length; i++) {
			if(list[i]!= null) {
				System.out.print(list[i]+" ");
				}
			
			
		}
		System.out.print("]");
		System.out.println();
		System.out.println(this.count+"곡 저장되어 있습니다.");
		
		return this.count;
	}
	
	/*
	 * SongList인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength() 는 저장된 음악의 개수를 반환
	 */
	
	
}
