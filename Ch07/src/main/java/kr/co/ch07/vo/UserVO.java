package kr.co.ch07.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 생성자constructor 만들때 4개 기본적으로 만들어줘야함
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
	
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	
	
	
}
