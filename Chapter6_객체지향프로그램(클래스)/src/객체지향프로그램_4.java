

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// Music 데이터형 (사용자 정의 데이터형)
/*
 * 	클래스명 => 식별자
 * 		1) 알파벳, 한글로 시작 (알파벳 대소문자 구분)
 * 		2) 숫자 사용 가능, 맨 앞은 사용 금지
 * 		3) 키워드 사용 금지
 * 		4) 특수문자 ( _ , $ ) 사용 가능 
 * 			***_클래스명 : 임시 클래스
 * 		약속 사항 : 대문자로 시작한다 (헝거리언식) FileName
 * 				 -----
 * 				  객체명은 변수명과 동일하게 만든다
 * 				  ----  ----(일반변수)
 * 				클래스의 변수명
 * 		class Music
 * 		Music music;
 * 	----------------------
 * 		class music
 * 		music music;
 * 
 * 		===> 메모리 저장
 * 			=========
 * 			Music m=new Music();
 * 						--------생성자 ==> 생성자는 반드시 앞에 new를 붙어서 사용한다
 * 			클래스 구성 요소
 * 			----재사용(is-a,has-a)
 * 				1. 변수	=======> 캡슐화
 * 				2. 메소드	=======> 수정/추가 => 다형성
 * 				3. 생성자	=======> 필요할 경우에만 사용
 * 			-------------------> 객체지향 형식
 */
class Music
{
	int mno; //0
	String title;
	String singer;
	String album;
	String poster;
	String state;
	int idcrement;
	
}
/*
 *  </tr>
                        
                            <tr class="list" songid="86941521">
                                <td class="check"><input type="checkbox" class="select-check" title="봄날" /></td>
                                <td class="number">71
                                        
                                    <span class="rank">
                                        
                                            
                                            
                                            
                                            
                                                <span class="rank"><span class="rank-up">3<span
                                                        class="hide">상승</span></span></span>
                                            
                                        
                                    </span>
                                </td>
                                <td><a href="#" class="cover" onclick="fnViewAlbumLayer('80921195');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/080/921/195/80921195_1486716752321_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="YOU NEVER WALK ALONE" /></a></td>
                                <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('86941521');return false;">곡 제목 정보 페이지</a></td>
                                <td class="info">
                                    
                                    
                                    <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('86941521','1');return false;">
                                        
                                            
                                        
                                        
                                        
                                        
                                            
                                                봄날</a>

                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('80221635');return false;">방탄소년단</a>
                                        
                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('86941521');">외</button>
                                            <ul class="list" id="RelationArtist_86941521"></ul>
                                        </div>
                                        
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('80921195');return false;">YOU NEVER WALK ALONE</a>
                                </td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-listen" title="재생" onclick="fnPlaySong('86941521;' ,'1'); return false;">듣기</a></td>
                                        <td class="btns"><a href="#" class="btn-basic btn-add" title="추가" onclick="fnPlaySong('86941521;' ,'3'); return false;">재생목록에 추가</a></td>
                                    
                                    
                                
                                <td class="btns"><button type="button" class="btn-basic btn-album" songId="86941521" id="add_my_album_86941521" onclick="fnAddMyAlbumForm('#add_my_album_86941521' , '86941521' ,10, 10);return false;">플레이리스트에 담기</button></td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-down" title="다운" onclick="fnDownSong('86941521');return false;">다운로드</a></td>
                                    
                                    
                                

                                <td class="btns">
                                    <div class="toggle-button-box lyr-mv" id="list-mv_86941521">
                                        
                                            
                                                <a href="#" class="btn btn-basic btn-mv" title="뮤비" alt="봄날" onclick="fnPlayMv('86941521','3'); return false;">뮤직비디오 보기</a>
                                            
                                            
                                        
                                    </div>
                                </td>
                                <td class="more">
                                    <div class="toggle-button-box">
                                        <button type="button" class="btn btn-basic btn-more">더보기</button>
                                        <ul class="list">
                                            
                                                
                                                    <li><a href="#" class="item" title="공유" onclick="shareDo('86941521');return false;">공유하기/음악나누기</a></li>
                                                
                                                
                                            
                                            
                                                
                                                    <li><a href="#" class="item" title="선물" onclick="fnGiftSong('86941521');return false;">선물하기</a></li>
                                                
                                                
                                            
                                        </ul>
                                    </div>
                                </td>
                            </tr>
 */
public class 객체지향프로그램_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music[] music=new Music[200]; // 클래스는 일반 변수처럼 배열 사용이 가능
		// 필요시에만 데이터 여러 개를 모아서 관리 ==> 클래스 ==> 메모리에 저장 ==> 객체(인스턴스)
		try
		{
			int k=0;
			for(int i=1;i<=4;i++)
			{
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20221107&hh=12&rtm=Y&pg="+i).get();
				//HTML => tag <태그명> => Element
				Elements title=doc.select("tr.list a.title");
				Elements singer=doc.select("tr.list a.artist");
				Elements album=doc.select("tr.list a.albumtitle");
				Elements etc=doc.select("tr.list span.rank");
				Elements poster=doc.select("tr.list a.cover");
				for(int j=0;j<title.size();j++)
				{
					music[k]=new Music();
					music[k].mno=k+1;
					music[k].title=title.get(j).text();
					music[k].singer=singer.get(j).text();
					music[k].album=album.get(j).text();
					String s=etc.get(j).text();
					music[k].state=s.replaceAll("[^가-힣]","");
					music[k].poster=poster.get(j).attr("src");
					//music[k].idcrement=Integer.parseIn(s.replaceAll("[^0-9",""));
					/*System.out.println(k+1);
					System.out.println(title.get(j).text());
					System.out.println(singer.get(j).text());
					System.out.println(album.get(j).text());
					System.out.println(etc.get(j).text());
					System.out.println("================================");*/
					k++;
				}
			}
		}catch(Exception ex) {}
		//실제 데이터 출력
		for(int i=0;i<music.length;i++)
		{
			String str="";
			if(music[i].state.equals("유지"))
				str="-";
			else if(music[i].state.equals("상승"))
				str="▲";
			else if(music[i].state.equals("하강"))
				str="▼";
			else
				str="NEW";
			System.out.println((i+1)+"."+str+" "+music[i].title+" "
								+music[i].singer+" "+music[i].album+" "+music[i].poster);
		}
	}

}
