package tcp2;

import java.io.Serializable;

public class Ex04_DTO implements Serializable{ //����ȭ ������� (Serializable) ���ϸ� ����
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name,addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Ex04_DTO(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	public Ex04_DTO() {
		// TODO Auto-generated constructor stub
	}

	
	
}
