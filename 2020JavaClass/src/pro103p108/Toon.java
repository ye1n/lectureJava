package pro103p108;

public class Toon {
	public String toonName;
	public String toonId;
	public String toonImg;

	// 생성자
	public Toon(String id, String name, String toonImg) {
		this.toonId = id;
		this.toonName = name;
		this.toonImg = toonImg;
	}

	// 내가 입력한 문자열이 웹툰 제목에 포함되는지를 알려주는 기능
	public boolean checkContain(String value) {
		if (toonName.contains(value)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return toonName + " : " + toonId + " : " + toonImg;
	}
}
