class Member{
	String id;
	String pwd;
	String pwdok;
	String name;
	String nickname;
	String idno;
	String birth;
	String sex;
	String email;
	String addno;
	String addr;
	String tel;
	String mobile;
	String job;
	String hobby;
	String intro;
}
public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1=new Member();
		member1.id="[     ]";
		member1.pwd="[     ]";
		member1.pwdok="[     ]";
		member1.name="[     ]";
		member1.nickname="[     ]";
		member1.idno="[     ]";
		member1.birth="[     ]";
		member1.sex="[     ]";
		member1.email="[     ]";
		member1.addno="[     ]";
		member1.addr="[     ]";
		member1.tel="[     ]";
		member1.mobile="[     ]";
		member1.job="[     ]";
		member1.hobby="[     ]";
		member1.intro="[     ]";
		
		System.out.println("아이디 "+member1.id);
		System.out.println("비밀번호 "+member1.pwd);
		System.out.println("비밀번호 확인 "+member1.pwdok);
		System.out.println("이름 "+member1.name);
		System.out.println("대화명 " +member1.nickname);
		System.out.println("주민등록번호 "+member1.idno);
		System.out.println("생년월일 "+member1.birth);
		System.out.println("성별 "+member1.sex);
		System.out.println("이메일 "+member1.email);
		System.out.println("우편번호 "+member1.addno);
		System.out.println("주소 "+member1.addr);
		System.out.println("전화번호 "+member1.tel);
		System.out.println("핸드폰 "+member1.mobile);
		System.out.println("직업 "+member1.job);
		System.out.println("취미 "+member1.hobby);
		System.out.println("자기소개 "+member1.intro);
		
		
	}

}
